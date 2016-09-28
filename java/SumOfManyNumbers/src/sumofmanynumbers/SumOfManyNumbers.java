/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name sumOfManyNumber v1
 */
package sumofmanynumbers;
import java.util.Scanner;  
public class SumOfManyNumbers {
    public static void main(String[] args) {//asks for a number and prints the sum
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Enter 0 to quit! \nPlease enter a number to add: ");
        int num=user_input.nextInt();
        System.out.printf("Your sum is now: %s\n",num);
        int num2=1;
        while (num2!=0){
        System.out.printf("\nPlease enter a number to add: ");
        num2=user_input.nextInt();
        num=num+num2;
        System.out.printf("Your sum is now: %s\n",num);
        }   
    }
}
