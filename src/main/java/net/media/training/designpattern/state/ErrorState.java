package net.media.training.designpattern.state;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class ErrorState extends State {
    public void equals(CalculatorContext context) {

        context.setState(context.calculatorState);
    }

    public void number(CalculatorContext context) {
        context.setState(context.calculatorState);
    }

    public void operator(CalculatorContext context) {

        context.setState(context.calculatorState);
    }

}
