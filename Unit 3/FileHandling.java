import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling
{
    public static void main(String args[]) throws FileNotFoundException {
        try {
            JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showOpenDialog(null);
            if(returnVal==JFileChooser.APPROVE_OPTION);
            String name = chooser.getSelectedFile().getAbsolutePath();
            File f = new File(name);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }
    catch(IOException io){
        System.out.println(io);
    }
}
}
