/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name ReverseOrder v1
 * @date Dec 11, 2015
 * @comment Reverses what the user entered (no clue why, but testing if the string was null doesn't work for me)
 */
package reverseorder;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Scanner;
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        List stringlist=new ArrayList<Integer>(asList());
        String input="Goodbye!";
        while (true) {
            stringlist.add(input);
            System.out.printf("Type a word: (enter quit to stop!) ");
            input=user_input.next();
            if (input.toLowerCase().equals("quit")||input.toLowerCase().equals("q")) {
                System.out.printf("The words you typed in reverse order are: \n");
                for (int i=stringlist.size()-1;i>=0;i-=1) {
                    System.out.printf("%s\n",stringlist.get(i));
                }
                break;
            }
        }
    }
}