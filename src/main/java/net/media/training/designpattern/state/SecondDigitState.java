package net.media.training.designpattern.state;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class SecondDigitState extends State {
    public void equals(CalculatorContext context) {
        context.currentValue = context.operate(context.currentValue , Integer.parseInt(context.display.toString()));
        context.display = new StringBuilder(context.currentValue.toString());
        context.currentOperator = null;
        context.setState(new FinalState());
    }

    public void number(CalculatorContext context) {
        context.display.append(context.input);
        context.setState(new SecondDigitState());
    }

    public void operator(CalculatorContext context) {
        context.currentValue = context.operate(context.currentValue , Integer.parseInt(context.display.toString()));
        context.display = new StringBuilder(context.currentValue.toString());
        context.currentOperator = context.input;
        context.setState(new FirstDigitState());
    }

}
