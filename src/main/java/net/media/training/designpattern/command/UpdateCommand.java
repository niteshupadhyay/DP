package net.media.training.designpattern.command;
import java.io.*
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class UpdateCommand implement Command {
    String fileName,content,oldContent;
    public UpdateCommand(String file,String con)
    {
        fileName=file;
        content=con;
    }
    public void execute() {
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + fileName + " does not exist");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder(); String nLine;
            while((nLine = reader.readLine())!=null) {
                sb.append(nLine);
            }
            oldContent = sb.toString();
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void rollback() {
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + fileName + " does not exist");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.write(oldContent);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
