package net.media.training.designpattern.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nitesh.u on 20/07/17.
 */
public abstract class State {

    public void equals(CalculatorContext context) {
        context.display = new StringBuilder("Error");
        context.currentOperator = null;
        context.currentValue = null;
        context.setState(new ErrorState());
    };

    public void number(CalculatorContext context) {
        context.display = new StringBuilder("Error");
        context.currentOperator = null;
        context.currentValue = null;
        context.setState(new ErrorState());
    };

    public void operator(CalculatorContext context) {
        context.display = new StringBuilder("Error");
        context.currentOperator = null;
        context.currentValue = null;
        context.setState(new ErrorState());
    };

    public void clear(CalculatorContext context) {
        context.display = new StringBuilder();
        context.currentOperator = null;
        context.currentValue = null;
        context.setState(new ClearState());
    }
}
