package net.media.training.designpattern.abstractfactory;

/**
 * Created by nitesh.u on 21/07/17.
 */
public abstract class PhonePart {
    abstract Case createCase();
    abstract MotherBoard createMotherBoard();
    abstract Processor createProcessor();
    abstract Screen createScreen();
}
