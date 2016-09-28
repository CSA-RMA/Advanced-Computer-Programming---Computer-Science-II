/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name guessingNumberGame v1
 */
package guessingnumbergame;
import java.util.Scanner;
import java.util.Random;
public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        int numberDrawn=drawNumber();
        System.out.printf("--------------------------------------------------------------------------- \nguessingNumberProgram: \n--------------------------------------------------------------------------- \n");
        int numba=0;
        int guesses=0; /* again, defines everything so the loop will work */
        while (numba!=numberDrawn) {
            guesses=guesses+1; /* adds one since guesses started out at zero */
            System.out.printf("\nGuess a number: ");
            numba=user_input.nextInt();
                if (numba>numberDrawn) {
                    System.out.printf("The number is less than your number! Guesses: %s",guesses);
                } else if (numba<numberDrawn) {
                    System.out.printf("The number is greater than your number! Guesses: %s",guesses);
                }
            }
        System.out.printf("\nYou got the number!(%s) \nYou got the number in %s guesses.  \nGoodbye! ",numberDrawn,guesses); /* prints answer, then quits*/
        }
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
