/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name averageNumberNew v1
 */
package averagenumbernew;
public class AverageNumberNew {
    public static double average(double number1, double number2, double number3, double number4) {
        return ((number1+number2+number3+number4)/4); /* adds them all and returns the sum over four */
    }
    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }
}
