/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name printingStars v1
 */
package printingstars;
public class PrintingStars {
    public static void main(String[] args) {
        printStars(5);
        printStars(1);
        printStars(3);
        printStars(1);
        printStars(5);
        printRectangle(17,3);
    }
    public static void printStars(int amount) {
        int i=0;
        while (i<amount) { //does while loop
            i=i+1; //adds
            System.out.printf("*"); //prints
        }
        System.out.printf("\n"); //goes to next line
    }
    public static void printRectangle(int amount1, int amount2) {
        int i2=0;
        while (i2<amount2) { //does while loop
            int i1=0;
            while (i1<amount1) { //does while loop
                i1=i1+1; //adds
                System.out.printf("*"); //prints
            }
            System.out.printf("\n"); //goes to next line
            i2=i2+1;
        }
        System.out.printf("\n"); //goes to next line
    }
}
