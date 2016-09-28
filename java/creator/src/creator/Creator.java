import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
class Creator {
    Creator() throws IOException {
        PrintWriter writer= new PrintWriter("codes.txt");
        Random randomnumgen=new Random();
        for(int i=0;i<50;i++) {
            String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            char[] text = new char[20];
            for (int o=0;o<20;o++) {
                text[o] = characters.charAt(randomnumgen.nextInt(characters.length()));
            }
            writer.println(text);
        }
        writer.close();
    }
}
