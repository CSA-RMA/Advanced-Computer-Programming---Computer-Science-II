/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name AgeinFiveYears v1
 */
package age.in.five.years;
import java.util.Scanner;
public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.print("Welcome! Please enter your name: ");
        String name=user_input.next();
        System.out.print("Howdy, "+name+"! How old are you? ");
        double age=user_input.nextInt();
        double futureage=(age+5);
        double pastage=(age-5);
        System.out.println("Did you know that in five years you will be "+futureage+"!");
        System.out.print("Also five years ago you were "+pastage+"!");
    }
    
}
