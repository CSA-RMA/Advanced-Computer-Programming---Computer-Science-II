/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name IsDivisible v1
 * @date Nov 5, 2015
 */
package isdivisible;
import java.util.Scanner;
public class IsDivisible {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Enter the numerator: ");
        int num1=user_input.nextInt();
        System.out.printf("Enter the denominator: ");
        int num2=user_input.nextInt();
        if (num1%num2==0) {
            System.out.printf("%s/%s can be divided without a remainder!\n",num1,num2);
        } else {
            System.out.printf("%s/%s cannot be divided without a remainder!\n",num1,num2);
        }            
    }
}
