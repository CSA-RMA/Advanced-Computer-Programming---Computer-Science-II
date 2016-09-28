/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name EveryOther v1
 * @date Dec 11, 2015
 * @comment Prints every other characters of a string.
 */
package everyother;
import java.util.Arrays;
import java.util.Scanner;
public class EveryOther {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Enter a string to be everyOther'ed! ");
        char[] idk=user_input.nextLine().toCharArray();
        for (int i=0;i<idk.length;i+=2) {
            System.out.printf("%s",idk[i]);
        }
    }
}