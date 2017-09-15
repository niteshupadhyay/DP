package net.media.training.designpattern.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class CalculatorContext {

    protected StringBuilder display;
    protected Integer currentValue;
    protected Character currentOperator;
    State calculatorState;
    Character input;

    private static List<Character> operators = new ArrayList<Character>() {
        {
            add('+');
            add('-');
            add('*');
            add('/');
        }
    };

    CalculatorContext() {
        display = null;
        currentValue = null;
        input = null;
        currentOperator = null;
        calculatorState = new ClearState();
    }

    public void setState(State state) {
        this.calculatorState = state;
    }

    public Integer operate(Integer i1, Integer i2) {
        switch (currentOperator) {
            case '+':
                return i1 + i2;
            case '-':
                return i1 - i2;
            case '*':
                return i1 * i2;
            case '/':
                return i1 / i2;
        }
        throw new RuntimeException("Invalid operator");
    }

    public boolean isDigit(Character c) {
        return c >= 48 && c <= 57;
    }

    public boolean isOperator(Character c) {
        return operators.contains(c);
    }

    public boolean isClear(Character c) {
        return c != null && c.equals('c');
    }

    public boolean isError() {
        return "Error".equals(display.toString());
    }

    public boolean isEqualsOperator(Character c) {
        return c != null && c.equals('=');
    }

    public void input(Character c) {
        input = c;
        if (isClear(c)) {
            calculatorState.clear(this);
            return;
        }

        if (isEqualsOperator(c)) {
            calculatorState.equals(this);
            return;
        }

        if (isDigit(c)) {
            calculatorState.number(this);
            return;
        }
        if (isOperator(c)) {
            calculatorState.operator(this);
            return;
        }

    }
}
