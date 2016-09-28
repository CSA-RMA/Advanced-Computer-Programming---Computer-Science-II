/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name leastNumberNew v1
 */
package leastnumbernew;
public class LeastNumberNew {
    public static int least(int number1, int number2) {
        if (number1<number2) { /* if number1 is lesser than number2 */
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {
        int answer =  least(2, 7);
        System.out.println("Least: " + answer);
    }
}
