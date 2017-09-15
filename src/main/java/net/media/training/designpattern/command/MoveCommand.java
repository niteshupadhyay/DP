package net.media.training.designpattern.command;
import java.io.*;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class MoveCommand  implement Command {

    private String lastName;
    private String currName;
    private String source;
    private String content;
    MoveCommand(String lastName,String currName){
        this.lastName=lastName;
        this.currName=currName;

    }
    void execute(){
        File file = new File(source);
        if(!file.exists())
            throw new RuntimeException("File Not Found");
        if(!file.renameTo(new File(content)));

    }
    void rollBack(){

        File file = new File(source);
        if(!file.exists())
            throw new RuntimeException("File Not Found");
        if(!file.renameTo(new File(content)))
            throw new RuntimeException("File Not Found");

    }


}
