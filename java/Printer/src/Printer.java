/* add a string that becomes the file so that you can close it but still access the string of the file */
import java.io.File;
import java.util.Scanner;
public class Printer {
    private String stringfile="";
    public Printer(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            stringfile+=reader.nextLine()+"\n";
        }
        reader.close();
    }
    public void printLinesWhichContain(String word) {
        for (String filenextline: stringfile.split("\n")){
            if(filenextline.contains(word)) {
                System.out.println(filenextline);
            }
        }
    }
}