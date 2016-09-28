/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name BMICalc v1
 */
package bmicalc;
import java.util.Scanner;
public class Bmicalc {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.print("Please enter your height in feet without inches: ");
        double fheight=user_input.nextDouble();
        System.out.print("Please enter your height in the remaining inches: ");
        double iheight=user_input.nextDouble();
        double height=((fheight*12)+iheight);
        double inch=(height*.025);
        System.out.print("Please enter your your weight in pounds: ");
        double weight=user_input.nextDouble();
        double pounds=(weight*.45);
        double finalinch=(inch*inch);
        double bmi=(pounds/finalinch);
        System.out.println("Your BMI is "+bmi+".");  
    }
    
}
