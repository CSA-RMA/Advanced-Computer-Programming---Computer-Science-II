/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name SimpleCalc v1
 * @date Dec 9, 2015
 * @comment Simple calculator program that asks the user for numbers, and what to do with them. 
 */
package simplecalc;
import java.util.Scanner;
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        while (true) {
            System.out.printf("What is your first number? ");
            double x=user_input.nextDouble();
            System.out.printf("What is your second number? ");
            double y=user_input.nextDouble();
            System.out.printf("What kind of math would you like to perform (Add, Subtract, Divide, Multiply)? ");
            String ans=user_input.next();
            if (ans.toLowerCase().equals("add") || ans.toLowerCase().equals("addition") || ans.toLowerCase().equals("+")) {
                System.out.printf("%s plus %s equals %s\n%s+%s=%s\n",x,y,(x+y),x,y,(x+y));
            }
            if (ans.toLowerCase().equals("sub") || ans.toLowerCase().equals("subtract") || ans.toLowerCase().equals("subtraction") || ans.toLowerCase().equals("-")) {
                System.out.printf("%s minus %s equals %s\n%s-%s=%s\n",x,y,(x-y),x,y,(x-y));
            }
            if (ans.toLowerCase().equals("div") || ans.toLowerCase().equals("divide") || ans.toLowerCase().equals("/")) {
                System.out.printf("%s divided by %s equals %s\n%s/%s=%s\n",x,y,(x/y),x,y,(x/y));
            }
            if (ans.toLowerCase().equals("mul") || ans.toLowerCase().equals("multiply") || ans.toLowerCase().equals("multi") || ans.toLowerCase().equals("*")) {
                System.out.printf("%s multiplied by %s equals %s\n%s*%s=%s\n",x,y,(x*y),x,y,(x*y));
            }
            System.out.printf("\nWould you like to exit? ");
            String qans=user_input.next();
            if (qans.toLowerCase().equals("q")||qans.toLowerCase().equals("quit")||qans.toLowerCase().equals("exit")||qans.toLowerCase().equals("leave")||qans.toLowerCase().equals("yes")) {
                break;
            }
        }
    }
}