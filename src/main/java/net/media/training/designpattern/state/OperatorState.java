package net.media.training.designpattern.state;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class OperatorState extends State {

    public void number(CalculatorContext context) {
        context.display = new StringBuilder(context.input);
        context.setState(new SecondDigitState());
    }


}
