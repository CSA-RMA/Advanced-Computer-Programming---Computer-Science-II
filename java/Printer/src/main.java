import java.io.File;
public class main {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("test/test.txt");
        printer.printLinesWhichContain("sidewalk");
        printer.printLinesWhichContain(":^)");
        File file = new File("test/testfile.txt");
        Analysis analysis = new Analysis(file);
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Characters: " + analysis.characters());
    }
}
