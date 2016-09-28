/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name $(name) v1
 */
package uptocertainnumber;
import java.util.Scanner;
public class UpToCertainNumber {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.print("What number should the counting stop at? ");
        int input=user_input.nextInt();
        int num=1;
        while (num<=input) {
            System.out.printf("%s\n",num);
            num=num+1;
        }
    }
}
