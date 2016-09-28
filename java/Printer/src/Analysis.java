import java.io.File;
import java.util.Scanner;
public class Analysis {
    private File file=null;
    private int charsCount=0;
    private int linesCount=0;
    
    Analysis(File file) throws Exception {
        this.file=file;
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            String nextLine = reader.nextLine();
            charsCount+=nextLine.length();
            ++linesCount;
        }
        reader.close();
    }
    public int lines() {
        return linesCount;
    }
    public int characters() {
        return charsCount+linesCount;
    }
}
