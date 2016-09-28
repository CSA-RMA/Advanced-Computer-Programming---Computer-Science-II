/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name evenNumbers v1
 */
package evennumbers;
public class EvenNumbers {
    public static void main(String[] args) {
        int num=2;
        while (num<=100) {
            if (num%2==0){
                System.out.printf("%s\n",num);
            }
            num=num+1;
        }
    }
}