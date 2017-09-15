package net.media.training.designpattern.abstractfactory;

/**
 * Created by nitesh.u on 21/07/17.
 */
public class ConcreteIphone extends AbstractFactory{
   public Processor createProcessor(){
        return new IphoneProcessor();
    }
    public MotherBoard createMotherBoard(){
        return new IphoneMotherBoard();
    }
   public Case createCase(){
        return new IphoneCase();
    }
   public Screen createScreen(){
        return new IphoneScreen();
    }
}
