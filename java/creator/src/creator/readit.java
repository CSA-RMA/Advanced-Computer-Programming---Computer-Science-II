import java.io.File;
import java.util.Scanner;
public class readit {
    readit() throws Exception {
        File file=new File("codes.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            String nextLine = reader.nextLine();
            System.out.println(nextLine);
        }
        Thread.sleep(1000);
    }
}
