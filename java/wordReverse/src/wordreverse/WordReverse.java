/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name wordReverse v1
 */
package wordreverse;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class WordReverse {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        ArrayList<String> array=new ArrayList<String>();
        String aword="no";
        while (!aword.equals("")) {
            System.out.printf("\nPlease enter a string: ");
            aword=user_input.nextLine();
            array.add(aword);
        }
        Collections.sort(array);
        System.out.printf("\n%s",array);
    }
}