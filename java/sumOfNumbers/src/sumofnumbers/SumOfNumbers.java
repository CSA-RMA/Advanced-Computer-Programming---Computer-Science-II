/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name sumOfNumbers v1
 */
package sumofnumbers;
public class SumOfNumbers {
    public static double sum(double number1, double number2, double number3, double number4) {
        return ((number1+number2+number3+number4)); /* adds them all and returns the sum */
    }

    public static void main(String[] args) {
        double answer = sum(4, 3, 6, 1);
        System.out.println("sum: " + answer);
    }
}
