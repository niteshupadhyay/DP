package net.media.training.designpattern.command;

/**
 * Created by nitesh.u on 20/07/17.
 */
public interface Command {
    void execute();
    void rollback();
}
