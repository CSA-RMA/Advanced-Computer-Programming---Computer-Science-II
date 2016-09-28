/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Inputs v1
 * @date Dec 9, 2015
 * @comment Shows that I know how to use scanners.
 */
package inputs;
import java.util.Scanner;
public class Inputs {
    private static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("What is your name? ");
        String name=user_input.next();
        System.out.printf("Hi, %s! How old are you? ",capitalize(name));
        double age=user_input.nextDouble();
        System.out.printf("Wow, you are %s years old! Where are you from? ",age);
        String location=user_input.next();
        System.out.printf("I've heard that %s is a great place!\n",location);
    }
}