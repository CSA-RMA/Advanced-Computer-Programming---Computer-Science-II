/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name JimsPizzeria v1
 * @date Dec 11, 2015
 * @comment Creates a pizza for the user.
 */
package jimspizzeria;
import java.util.Scanner;
public class JimsPizzeria {
    public static void main(String[] args) {
        while (true) {
            Scanner user_input=new Scanner(System.in);
            System.out.printf("Please enter either cheese or pepperoni the type of pizza you want: ");
            String type=user_input.next();
            if (type.toLowerCase().equals("done")) {
                break;
            } else if (!type.toLowerCase().equals("cheese")||!type.toLowerCase().equals("pepperoni")) {
                System.out.printf("Please enter either cheese or pepperoni!\nPlease enter the type of pizza you want: ");
                type=user_input.next();
            }
            System.out.printf("Please enter either 10, 12, or 14 inches for the size of pizza you want: ");
            int size=user_input.nextInt();
            if (size>14||size<10) {
                System.out.printf("Please enter either 10, 12, or 14 inches!\nPlease enter the size of pizza you want: ");
                size=user_input.nextInt();
            }
            Pizza input=new Pizza(type,size);
            System.out.printf("A %s inch %s pizza will cost %s! \n",input.size,input.type,input.price);
        }
        System.out.printf("Goodbye! ");
    }
}
class Pizza {
    double price;
    String type;
    int size;
    public Pizza() {
        this.size=12;
        this.type="Cheese";
        this.price=7.00;
    }
    public Pizza(String type, int size) {
        this.type=type;
        this.size=size;
        if (this.type.equals("cheese")) {
            if (this.size==10) {
                this.price=6.00;
            } else if (this.size==12) {
                this.price=7.00;
            } if (this.size==14) {
                this.price=8.00;
            }
        } else if (this.type.equals("pepperoni")) {
            this.price=this.size-2.00;
        }
    }
}