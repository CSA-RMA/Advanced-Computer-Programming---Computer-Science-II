/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name AskingQuestions v1
 */
package askingquestions;
import java.util.Scanner;
public class Askingquestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
	System.out.print("How old are you? ");
	double age = keyboard.nextInt();
	System.out.print("How many feet tall are you? ");
	int fheight = keyboard.nextInt();
        System.out.print("And how many inches? ");
        int iheight = keyboard.nextInt();
	System.out.print("How much do you weigh? ");
	double weight = keyboard.nextDouble();
	System.out.println("So, you're " + age + " years old, " + fheight +"'"+iheight+'"'+ " tall and " + weight + " heavy." );
    }
    
}
