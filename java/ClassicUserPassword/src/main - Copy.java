import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner user_input=new Scanner(System.in);
        int incorrectcounter=0;
        while(incorrectcounter<3) {
            boolean loggedin=false;
            Scanner filereader= new Scanner(new File("users.txt"));
            System.out.print("Username: ");
            String username=user_input.nextLine();
            System.out.print("Password: ");
            String password=user_input.nextLine();
            while(filereader.hasNextLine()){ 
                String fileline1=filereader.nextLine();
                String fileline2=filereader.nextLine();
                if(fileline1.equals(username)) {
                    if(fileline2.equals(password)) {
                        System.out.println("SUCCESSFUL, YOU ARE LOGGED IN!");
                        loggedin=true;
                        break;
                    }
                }
            }
            if(!loggedin) {
                System.out.println("USERNAME OR PASSWORD INCORRECT! TRY AGAIN");
                incorrectcounter++;
            }
            else {
                break;
            }
        }
    }
}