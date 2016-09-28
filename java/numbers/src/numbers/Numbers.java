//Written by Ryan
//School: Chaparral Star Academy
//Numbers v1, written on the 21 of January, in 2016
//Shows off the NumberStatistics program!
package numbers;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenstats = new NumberStatistics();
        NumberStatistics oddstats = new NumberStatistics();
        Scanner user_input=new Scanner(System.in);
        double enterednumber = 0;
        while (true){
            System.out.printf("Enter a number to add list: ");
            enterednumber=user_input.nextDouble();
            if(enterednumber != -1.0)
            {
                if(enterednumber % 2 == 0)
                {    
                    stats.addNumber(enterednumber);
                    evenstats.addNumber(enterednumber);
                } else
                {
                    stats.addNumber(enterednumber);
                    oddstats.addNumber(enterednumber);
                }
            } else
            {
                break;
            }
        }
        System.out.println("\nAmount: " + stats.amountOfNumbers());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());
        System.out.println("\nEven Amount: " + evenstats.amountOfNumbers());
        System.out.println("Even Sum: " + evenstats.sum());
        System.out.println("Even Average: " + evenstats.average());
        System.out.println("\nOdd Amount: " + oddstats.amountOfNumbers());
        System.out.println("Odd Sum: " + oddstats.sum());
        System.out.println("Odd Average: " + oddstats.average());
        
    }
}