package net.media.training.designpattern.state;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class FirstDigitState extends State {


    public void number(CalculatorContext context) {
        context.display.append(context.input);
        context.setState(new FirstDigitState());
    }

    public void operator(CalculatorContext context) {
        context.currentValue = Integer.parseInt(context.display.toString());
        context.currentOperator = context.input;
        context.setState(new OperatorState());
    }

}
