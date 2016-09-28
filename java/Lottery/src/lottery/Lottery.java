/* * Lottery v1: written by Ryan Ames on 1/26/16 * */
/* * To be used by Chaparral Star Academy as a lottery simulation * */
package lottery;
import java.util.ArrayList;
public class Lottery    {
    public static void main(String[] args)  {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();
        System.out.println("Lottery numbers:");
        for (int number : numbers)  {
            System.out.print(number + " ");     }
        System.out.println(""); }   }
