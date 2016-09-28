/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name RecursiveMethod v1
 * @date Nov 6, 2015
 */
package recursivemethod;
import java.util.Scanner;
public class RecursiveMethod {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Enter a number to be exponent'd: ");
        double num=user_input.nextDouble();
        System.out.printf("Enter the exponent of the number: ");
        int exponent=user_input.nextInt();
        double ans=Math.pow(num, exponent);
        System.out.printf("%s^%s=%s\n",num,exponent,ans);
    }
}
