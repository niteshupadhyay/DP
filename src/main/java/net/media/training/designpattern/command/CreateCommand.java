package net.media.training.designpattern.command;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class CreateCommand implements Command{
    String filename,content;
    public CreateCommand(String file,String con)
    {
        filename=file;
        content=con;
    }
    public void execute()
    {
        File file = new File(filename);
        if (file.exists())
            throw new RuntimeException("File already exist");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void rollback()
    {
        File file = new File(filename);
        file.delete();
    }
}
