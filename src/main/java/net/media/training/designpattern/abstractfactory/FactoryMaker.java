package net.media.training.designpattern.abstractfactory;

/**
 * Created by nitesh.u on 21/07/17.
 */
public class FactoryMaker {

    private static AbstractFactory abstractFactory=null;
    static AbstractFactory getAbstractFactory(String type){
        if(type=="IPhone"){
            abstractFactory=new ConcreteIphone();

        }
        if(type=="AndroidPhone"){
            abstractFactory=new ConcreteIphone();

        }
        return abstractFactory;
    }
}
