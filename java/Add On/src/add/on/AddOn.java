/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name addOn v1
 */
package add.on;
import java.util.Scanner;
public class AddOn {
    public static void main(String[] args) {
        print();
    }
    public static void print() {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("--------------------------------------------------------------------------- \naddOnProgram: \n--------------------------------------------------------------------------- \n");
        String str=("In the beginning there were the swamp, the ho and Java.");
        System.out.printf("Please how many times you would like to print your string (%s): ",str);
        int times=user_input.nextInt();
        int nottimes=0;
        while (nottimes<times) { //while not times is less than times
            System.out.printf("%s\n",str); // prints
            nottimes=nottimes+1; // adds one so loop will eventually end
        }
    }
    
}
