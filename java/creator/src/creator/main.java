import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws IOException, Exception {
        Creator();
        readit();
        checkit();
    }
    public static void Creator() throws IOException {
        PrintWriter pw= new PrintWriter("codes.txt");
        Random random=new Random();
        for(int i=0;i<50;i++) {
            String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            char[] text = new char[20];
            for (int o=0;o<20;o++) {
                text[o] = characters.charAt(random.nextInt(characters.length()));
            }
            pw.println(text);
        }
        pw.close();
    }
    public static void readit() throws Exception {
        File file=new File("codes.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            String nextLine = reader.nextLine();
            System.out.println(nextLine);
        }
        Thread.sleep(10000);
        reader.close();
    }
    public static void checkit() throws Exception {
        File file=new File("codes.txt");
        Scanner fileReader = new Scanner(file);
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=user_input.nextLine();
        while (fileReader.hasNext()) {
            String nextLine = fileReader.nextLine();
            if(input.equals(nextLine)) {
                System.out.println("LOGIN COMPLETE");
                PrintWriter pw= new PrintWriter("codes.txt");
                pw.write("");
                System.exit(0);
            }
        }
        Thread.sleep(5000);
        fileReader.close();
    }
}