/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Hungman v1
 */
import hangman.Hangman;
import java.util.Scanner;
public class HangmanUserInteface {
    public static void main(String[] args) {
        Hangman hangman=new Hangman();
        System.out.println("");
        printMenu();
        while (hangman.gameOn()) { /*checks if game is running */
            System.out.printf("Please enter a communist: ");
            Scanner user_input=new Scanner(System.in);
            String option=user_input.nextLine();
            if (option.equals("quit")){ /*if option is quit */
                break;
            }
            while (option==null || option.isEmpty()) { /*if option is empty */
                printMenu(); /*show menu */
                option=user_input.nextLine();
            }
            while (option.equals("status")) {
                hangman.printStatus(); /*prints game status */
                option=user_input.nextLine();
            }
            if(option.length() == 1) {  /* command has only one letter, so it must be a guess */
                hangman.guess(option);
                hangman.printMan();
                hangman.printWord();
            }
        }
        System.out.println("");
        System.out.println("Thank you for playing!");
    }
    public static void printMenu() { /*prints everything in seperate lines to be "programmer friendly" */
        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
        System.out.println();
    }
}