/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name reverseString v1
 */
package reversestring;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Please enter a string to be reversed: ");
        String str=user_input.nextLine();
        String rstr=stringReverser(str);
        System.out.printf("The string reversed is : %s ",rstr);
    }
    public static String stringReverser(String x) {
        int z=x.length()-1;
        String y="";
            while (z>=0) {
                y=y+x.charAt(z);
                z=z-1;
            }
        return y;
    }
}
