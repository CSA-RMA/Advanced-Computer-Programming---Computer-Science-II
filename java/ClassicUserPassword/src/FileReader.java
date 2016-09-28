import java.util.Scanner;
public class FileReader {
    FileReader() {
    }
    boolean read2Lines(Scanner reader, String username, String password) throws Exception {
        while (reader.hasNextLine()) {
            String fileline1=reader.nextLine();
            String fileline2=reader.nextLine();
            if(fileline1.equals(username)) {
                if(fileline2.equals(password)) {
                    return true;
                }
            }
        }
        reader.close();
        return false;
    }
}