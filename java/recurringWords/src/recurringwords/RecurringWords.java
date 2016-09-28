/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name recurringWords v1
 */
package recurringwords;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class RecurringWords {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        ArrayList words=new ArrayList();
        String word="!";
        while(true) { /* while the string the user enters is not empty */
            System.out.printf("Please enter a string: ");
            word=user_input.nextLine();
            words.add(word);  /* add the word to the arraylist */
            Set<Integer> set=new HashSet<>(words); /* creates a set based on words */
            if(set.size()<words.size()){ /* if the set has less than the arraylist */
                break;
            }
        }
        System.out.printf("You entered the string \"%s\" twice! ",word); /* because sets don't allow duplicates */
    }
}