/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name endOfString v1
 */
package endofstring;
import java.util.Scanner;
public class EndOfString {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Please enter a string: ");
        String str=user_input.nextLine();
        System.out.printf("Please enter how many characters at the end of the string you would like to print: ");
        int num=user_input.nextInt();
        String funcreturn=thesubstring(str, num);
        System.out.printf("Returned string: %s ", funcreturn);
    }
    public static String thesubstring(String x, int y) {
        return x.substring(x.length()-y);
    }
}
