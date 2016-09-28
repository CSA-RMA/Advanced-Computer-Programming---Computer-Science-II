/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name JimBobSCarPaymentCalc v1
 * @date Dec 13, 2015
 * @comment Program to handle customers' loans based on their credit scores.
 */
package jimbob.scarpaymentcalc;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Scanner;
public class JimBobSCarPaymentCalc {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        List users=new ArrayList<ArrayList>(asList(new ArrayList<>(asList("jimbob","4321red")),new ArrayList<>(asList("jennys","Dude5!")),new ArrayList<>(asList("user","pass"))));
        System.out.printf("Please enter your username: ");
        String username=user_input.next();
        System.out.printf("Please enter your password: ");
        String password=user_input.next();
        int times=0;
        while (!checkIfUser(username,password,users) && times<2) {
            times++;
            System.out.printf("You have entered an incorrect username or password!\nPlease enter your username: ");
            username=user_input.next();
            System.out.printf("Please enter your password: ");
            password=user_input.next();
        }
        if(times>=2) {
            System.out.printf("You have entered incorrect information too many times!\n");
            System.exit(0);
        }
        System.out.printf("Welcome, %s! Please enter your credit score: ",username);
        double creditscore=Math.abs(user_input.nextDouble());
        while(creditscore<400.0 || creditscore>=850) {
            System.out.printf("Please enter a number between 400 and 850, %s! \nPlease enter your credit score: ",username);
            creditscore=Math.abs(user_input.nextDouble());
        }
        int maxyear=0;
        double rate=0;
        if(creditscore>750) {
            maxyear=6;
            rate=0.039;
        } else if (creditscore>650) {
            maxyear=5;
            rate=0.069;
        } else if (creditscore>550) {
            maxyear=4;
            rate=0.079;
        } else {
            maxyear=4;
            rate=0.099;
        }
        System.out.printf("Please enter the length of loan (max of %s years): ",maxyear);
        int years=Math.abs(user_input.nextInt());
        while(years>maxyear) {
            System.out.printf("Please enter a length of loan less than %s! \nPlease enter the length of loan (max of %s years): ",years,maxyear);
            years=Math.abs(user_input.nextInt());
        }
        System.out.printf("Please enter the ammount you would like loaned: ");
        double ammount=user_input.nextDouble();
        double newrate=0;
        double totalammount=0;
        for(int i=0;i<years;i+=1){ 
            newrate=(Math.pow(1.0+(rate/12.0),12))-1.0;
            totalammount=ammount+(ammount*newrate);
        }
        System.out.printf("\nCredit Score: %s\nAmmount loaned: %s\nLength of loan: %s\nPayment for a loan of %s months at a rate of %s%%: %s per month, %s total\n",creditscore,ammount,years,years*12,rate*100,totalammount/(years*12),totalammount);
    }
    public static boolean checkIfUser(String username,String password,List users) {
        for(int i=0;i<users.size();i++) {
            List userinfo=(List) users.get(i); /*creates new list for each sublist */
            if (username.equals(userinfo.get(0)) && password.equals(userinfo.get(1))) { /*checks if username and password are in correct position & equal eachother */
                return true;
            }
        }
        return false;
    }
}