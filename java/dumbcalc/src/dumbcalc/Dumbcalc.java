/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name DumCalc v1
 */
package dumbcalc;
import java.util.Scanner;
public class Dumbcalc {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.print( "What is your first number? " );
        double first = user_input.nextDouble();
        System.out.print("What is your second number? ");
        double second = user_input.nextDouble();
        System.out.print("What is your third number? ");
        double third = user_input.nextDouble();
        double total=(first+second+third);
        double newtotal=(total/2);
        System.out.println("Your total is "+newtotal+".");
    }
    
}
