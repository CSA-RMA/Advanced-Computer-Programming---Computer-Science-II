import java.util.Scanner;
public class GuessingGame {
    private Scanner user_input;
    public GuessingGame() {
        this.user_input = new Scanner(System.in);
    }
    public void play(int lowerLimit, int upperLimit) {
        instructions(upperLimit, lowerLimit);
        int middlenumber=lowerLimit+(upperLimit-lowerLimit)/2;
        while (lowerLimit <= upperLimit) {
            middlenumber=lowerLimit+(upperLimit-lowerLimit)/2;
            System.out.printf("Is your number greater than %s? (y/n)\n",middlenumber);
            String answer=user_input.next();
            if (answer.equals("n")) {
                if(middlenumber-1==lowerLimit) {
                    middlenumber=lowerLimit;
                    upperLimit=lowerLimit;
                }
                upperLimit=middlenumber-1;
            } else 
            if (answer.equals("y")) { 
                if(middlenumber+1==upperLimit) {
                    middlenumber=upperLimit;
                    lowerLimit=upperLimit;
                }
                lowerLimit=middlenumber+1;
            }
        }
        System.out.printf("The number you're thinking of is %s!\n\n",middlenumber);
    }
    public boolean isGreaterThan(int value) {
        System.out.printf("Is your number greater than %s? (y/n)\n",value);
        String answer=user_input.next();
        if (answer.equals("n")) {
            return false;
        } else 
        if (answer.equals("y")) { 
            return true;
        }
        return false;
    }
    public int average(int firstNumber, int secondNumber) {
        return (firstNumber+secondNumber)/2;
    }
    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + " and " + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }
    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}