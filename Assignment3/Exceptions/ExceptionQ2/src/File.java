import java.io.*;
import java.io.FileReader;
public class File {
    public File(Object names) {
    }

    public static void main(String[] args) {
        try {
            File f = new File("names.txt");
            PrintWriter writer=new PrintWriter(new FileWriter("names"),true);
            writer.println("Xolani,Steven,thabo");
            writer.close();
            FileReader filer= new FileReader("names.txt");
            filer.read();
            filer.close();

        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
