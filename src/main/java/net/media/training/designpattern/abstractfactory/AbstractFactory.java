package net.media.training.designpattern.abstractfactory;

/**
 * Created by nitesh.u on 21/07/17.
 */
public abstract class AbstractFactory {
    public abstract MotherBoard createMotherBoard();
    public abstract Case createCase();
    public abstract Screen createScreen();
    public abstract Processor createProcessor();
}
