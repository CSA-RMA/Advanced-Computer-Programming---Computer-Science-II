/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Menu v1
 * @date Dec 10, 2015
 * @comment simple conditional program, using inputs. loops, and variables that gives the user a menu with following options: Divisors, Location, Age check, Quit
 */
package menu;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) throws InterruptedException {
        Scanner user_input=new Scanner(System.in);
        String min=""; /* short for menuinput */
        while (!min.equals("4")) {
            System.out.printf("menu.java\n\nOption 1: Divisiors (tells if number is divisible by number without remainder)\nOption 2: Location (asks if in XII state)\nOption 3: Age Check (check if old enough for licence/permit)\nOption 4: Quit (ends program)\nPlease enter the number of the option you would like to select: ");
            min=user_input.next();
            if (min.equals("1")) {
                String ans="";
                while (!ans.equals("yes")) {
                    System.out.printf("\n\n\nDivisors\n\nWhat is your first number? ");
                    int x=user_input.nextInt();
                    System.out.printf("What is your second number? ");
                    int y=user_input.nextInt();
                    if (x%y==0) {
                        System.out.printf("%s divided by %s is %s with no remainder!\n\n",x,y,(x/y));
                        Thread.sleep(3000);
                    } else {
                        System.out.printf("%s divided by %s is %s with a remainder of %s!\n\n",x,y,(x/y),(x%y));
                        Thread.sleep(3000);
                    }
                    System.out.printf("Would you like to exit? ");
                    ans=user_input.next().toLowerCase();
                }
            } else if (min.equals("2")) {
                String ans="";
                while (!ans.equals("yes")) {
                    List bigxii=new ArrayList<>(asList("texas","iowa","kansas","oklahoma","west virginia"));
                    System.out.printf("\n\n\nLocations\n\nWhat state do you live in? (Enter exit to exit) ");
                    String istate=user_input.next().toLowerCase();
                    if (bigxii.contains(istate)) {
                        System.out.printf("Awesome, you should consider a Big XII school! \n");
                        Thread.sleep(2000);
                    } else if (!istate.equals("quit")) {
                        System.out.printf("Awesome, you should consider a non-Big XII school! \n");
                        Thread.sleep(2000);
                    } else {
                        System.out.printf("Returning to menu... \n\n");
                        Thread.sleep(3000);
                    }
                    System.out.printf("Would you like to exit? ");
                    ans=user_input.next().toLowerCase();
                }
            } else if (min.equals("3")) {
                String ans="";
                while (!ans.equals("yes")) {
                    System.out.printf("\n\n\nAge Check\n\nWhat is your name? ");
                    String name=user_input.next().toLowerCase();
                    System.out.printf("What is your age? ");
                    double age=user_input.nextDouble();
                    if (age>=16) {
                        System.out.printf("%s, you are old enough to drive!\n\n",name);
                        Thread.sleep(3000);
                    } else {
                        System.out.printf("%s, you are not old enough to drive yet!\n\n",name);
                        Thread.sleep(3000);
                    }
                    System.out.printf("Would you like to exit? ");
                    ans=user_input.next().toLowerCase();
                }
            }
        }
        System.out.printf("\nGoodbye! \nQuitting program... \n\n");
    }
}