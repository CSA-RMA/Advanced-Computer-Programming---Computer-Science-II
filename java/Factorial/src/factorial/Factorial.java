/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name factorialProgram v1
 */
package factorial;
import java.util.Scanner;
 
class Factorial{
   public static void main(String args[]) {
    Scanner user_input=new Scanner(System.in);
    System.out.printf("Please enter the number you would like to factor: ");
    int count, total=0, input=user_input.nextInt();
    if (input<0){
        System.out.println("Please enter a positive number! ");
    }else {
        for (count=1;count<=input;count++) {
            total=total*count;
        }
        System.out.printf("Factorial of %s is %s\n%s!=%s \n",input,total,input,total);
      }
   }
}