/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Conditionals_Loops v1
 */
package conditionals_loops;

import java.util.Scanner;
public class Conditionals_Loops {
    public static void main(String[] args) {
                login();
                leapyearcheck();
                age();
                secret();
        
        

    }
    
    public static void age() {
        Scanner user_input=new Scanner(System.in);
        
        int age;
        System.out.printf("--------------------------------------------------------------------------- \n");
        System.out.printf("reasonableAgeProgram: \n");
        System.out.printf("--------------------------------------------------------------------------- \n");
        System.out.printf("Please enter your age: ");
        age=user_input.nextInt();
        
        if (age>=0 && age<=122) {
            System.out.printf("OK, thats a reasonable age. \n");
        } else {
            System.out.printf("OK, thats an impossible age!  \n");
        }
    }
    public static void leapyearcheck() {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("--------------------------------------------------------------------------- \n");
        System.out.printf("leapYearCheckProgram: \n");
        System.out.printf("--------------------------------------------------------------------------- \n");
        System.out.printf("Please enter a year: ");
        int year=user_input.nextInt();    

        boolean isLeapYear=((year%4==0) && (year%100!=0) || (year%400 == 0));

        if (isLeapYear)
        {
            System.out.printf("%s is a leap year.",year);
        } else
            System.out.printf("%s is not a leap year.",year);
    }
    
    public static void login() {
        System.out.printf("--------------------------------------------------------------------------- \n");
        System.out.printf("loginProgram: \n");
        System.out.printf("--------------------------------------------------------------------------- \n");
        System.out.printf("Hello, please login to your account. \n");
        System.out.printf("There are only 2 accounts at the moment. \n");
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Please enter your USERNAME here: \n");
        String user=user_input.nextLine();
        System.out.printf("Please enter your PASSWORD here: \n");
        String pass=user_input.nextLine();
        if (user.equals("alex")) {
            if (pass.equals("mightyducks")) {
                System.out.println("Welcome alex!");
            }
            else {
                System.out.println("Invalid password or username.");
                login();
            }
        }
        else if (user.equals("emily")) {
            if (pass.equals("cat")) {
                System.out.println("Welcome emily!");

            }
            else {
                System.out.println("Invalid password or username.");
                login();
            }
        }
        else {
            System.out.println("Invalid password or username.");
            login();
        }
        
        
    }
    public static void secret(){ //  asks for a password and checks it
        Scanner user_input = new Scanner(System.in);
        System.out.printf("--------------------------------------------------------------------------- \n");
        System.out.printf("secretProgram: \n");
        System.out.printf("--------------------------------------------------------------------------- \n");
        System.out.printf("Hey, you need to enter the secret passphrase to get to our secrets! ");
        String passphrase=user_input.nextLine();
        String secretpassphrase=("carrot");
        
        while (true){
            if (passphrase.equals(secretpassphrase)){
                System.out.printf("Alright, you're coolio!\nThe secret is: jryy qbar\n");
                break;
            }else{
                System.out.printf("Get outta here, thinkin %s is the code! \n",passphrase);
                secret();
                
            }
        }
    }
