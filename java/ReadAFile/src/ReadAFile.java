import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ReadAFile {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}