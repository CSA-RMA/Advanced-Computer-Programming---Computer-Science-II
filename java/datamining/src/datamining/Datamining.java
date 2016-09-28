/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name DataMining v1
 */
package datamining;
import java.util.Scanner;
public class Datamining {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Please enter the following info so I can keep it on my servers for the rest of eternity, and sell it for a profit!\n\nFirst name: ");
        String fname=user_input.next();
        System.out.printf("Last name: ");
        String lname=user_input.next();
        System.out.printf("Grade (9-12): ");
        int grade=user_input.nextInt();
        System.out.printf("Student ID: ");
        int id=user_input.nextInt();
        System.out.printf("Username: ");
        String username=user_input.next();
        System.out.printf("GPA (0.0-4.0): ");
        double gpa=user_input.nextDouble();
        System.out.printf("Your information that is being sold right now: \n\tLogin: %s \n\tID: %s \n\tName: %s,%s \n\tGPA: %s \n\tGrade: %s \n", username, id, lname, fname, gpa, grade);
    }
    
}
