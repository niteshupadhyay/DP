package net.media.training.designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldManipulator {

    private ArrayList<Command> commandList;

    public void fixManipulate(final String fileName, final String newPath) {
        commandList = new ArrayList<Command>();
        commandList.add(new CreateCommand(fileName,"hello world"));
        commandList.add(new UpdateCommand(fileName,"new hello world"));
        commandList.add(new MoveCommand(fileName,newPath));

        int cnt = 0;
        try {
            for(;cnt<commandList.size();cnt++)
                commandList.get(cnt).execute();

        } catch (Exception e) {
            for( ;cnt>=0;cnt--)
                commandList.get(cnt).rollback();
        }
    }

    public void brokenManipulate(String fileName, String newPath) {
        commandList = new ArrayList<Command>();
        commandList.add(new CreateCommand(fileName,"hello world"));
        commandList.add(new UpdateCommand(fileName,"new hello world"));
        commandList.add(new MoveCommand(fileName,newPath));
        commandList.add(new CreateCommand(fileName,"hello world"));

        int cnt = 0;
        try {
            for(;cnt<commandList.size();cnt++)
                commandList.get(cnt).execute();

        } catch (Exception e) {
            for( ;cnt>=0;cnt--)
                commandList.get(cnt).rollback();
        }


    }

}