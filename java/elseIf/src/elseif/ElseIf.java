/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name elseIf v1
 */
package elseif;
import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Greater Than Program v1;\nPlease enter your first number: ");
        int fgnum=user_input.nextInt();
        System.out.printf("Please enter your second number: ");
        int sgnum=user_input.nextInt();
        greaterThanCheck(fgnum,sgnum);
        System.out.printf("\n------------------------------------------------------------\n");
        gradeBookProgram();
    }
    public static void greaterThanCheck(int x, int y){
        if (x>y) {
            System.out.printf("\nThe first number is greater than the second number. (%s < %s) ",x,y);
        }
        if (x<y) {
            System.out.printf("\nThe first number is less than the second number. (%s > %s) ",x,y);
        }
        if (x==y) {
            System.out.printf("\nThe first number is equal to the second number. (%s = %s) ",x,y);
        }
        
    }
    public static void gradeBookProgram(){
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Gradebook Program v1;\nPlease enter your grade number: ");
        int gradenumber=user_input.nextInt();
        if (gradenumber > 0 && gradenumber <= 29) {
            System.out.printf("They would fail the assignment. \n");
            gradeBookProgram();
        }
        else if (gradenumber >= 30 && gradenumber <= 34) {
            System.out.printf("They would get a 1 for the assignment. \n");
            gradeBookProgram();
        }
        else if (gradenumber >= 35 && gradenumber <= 39) {
            System.out.printf("They would get a 2 for the assignment. \n");
            gradeBookProgram();
        }
        else if (gradenumber >= 40 && gradenumber <= 44) {
            System.out.printf("They would get a 3 for the assignment. \n");
            gradeBookProgram();
        }
        else if (gradenumber >= 45 && gradenumber <= 49) {
            System.out.printf("They would get a 4 for the assignment. \n");
            gradeBookProgram();
        }
        else if (gradenumber >= 50 && gradenumber <= 60) {
            System.out.printf("They would get a 5 for the assignment. \n");
            gradeBookProgram();
        }
        else if (gradenumber == 0) {
            System.out.print("They would fail the assignment. \n");
            gradeBookProgram();
        }
    }
}
