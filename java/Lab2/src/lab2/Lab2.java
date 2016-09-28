/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Lab2 v1
 */
package lab2;
import java.util.Scanner;
public class Lab2 {
    public static void addressCheck(String address, String name) {
    }
    public static void weatherCheck() {
        System.out.print("This is a weather check!");
    }
    public static void menuCheck(int option) {
        System.out.println("You have chosen option "+option+".");
    }
    public static void quitCheck(String answer){
        System.out.print("Exiting...");
    }
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.print("Welcome! Please enter your name: ");
        String name=user_input.next();
        System.out.print("Please enter your address: ");
        String address=user_input.next();
        addressCheck(address, name);
        System.out.print("Please enter a number between 1 and 5: ");
        int option=user_input.nextInt();
        menuCheck(option);
        
    }
    
}
