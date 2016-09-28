/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name nameagesalary v1
 */
package nameagesalary;
import java.util.Scanner;
public class Nameagesalary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
	System.out.print("Hello, what is your name? ");
	String name = keyboard.next();
	System.out.printf("Hi, %s! How old are you? ", name);
	int age = keyboard.nextInt();
        System.out.printf("So, you're %s, eh? That's pretty old, you're probably gonna die soon!", age);
        System.out.printf("\nHow much money do you make, %s? ", name);
        double salary = keyboard.nextDouble();
	System.out.printf("%s! I hope that's per hour and not per year, you poor potato! ", salary);
    }
    
}
