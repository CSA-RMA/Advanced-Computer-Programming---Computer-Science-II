/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name greatestNumberNew v1
 */
package greatestnumbernew;
public class GreatestNumberNew {
    public static int greatest(int number1, int number2, int number3) {
        if (number1>number2&&number1>number3) { /* if number1 is greater than number2 and number3 */
            return number1;
        } else if (number2>number3) { /* if number2 is greater than number3 */
            return number2;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int answer =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
    
}
