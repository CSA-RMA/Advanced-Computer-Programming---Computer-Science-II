/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofthepowers;
import java.util.Scanner;
public class SumOfThePowers {
    	public static void main(String args[]) {
            int numPowersOf2;
            int exponent=0;
            int total=0;
            Scanner user_input=new Scanner(System.in);
            System.out.println("How many powers of 2 would you like to be summed?");
            numPowersOf2=user_input.nextInt();
            System.out.printf("\nHere are the first %s powers of 2: \n",numPowersOf2);
            while (exponent<=numPowersOf2) {
                numPowersOf2=(int)Math.pow(2, exponent);
                exponent++;
                System.out.printf("%s, ",numPowersOf2);
                total=total+numPowersOf2;
             }
            System.out.printf("Here is your total sum: %s\n",total);
        }
}