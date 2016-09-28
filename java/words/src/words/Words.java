/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name words v1
 */
package words;
import java.util.ArrayList;
import java.util.Scanner;
public class Words {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        ArrayList words=new ArrayList();
        String word="!";
        while(!word.isEmpty()) { /* while the string the user enters is not empty */
            System.out.printf("Please enter a string: ");
            word=user_input.nextLine();
            words.add(word);  /* add the word to the arraylist */
        }
        System.out.printf("You entered these strings: ");
        for(Object x:words) { /* prints out the strings in the arraylist */
            System.out.printf("\n%s",x);
        }
    }
}