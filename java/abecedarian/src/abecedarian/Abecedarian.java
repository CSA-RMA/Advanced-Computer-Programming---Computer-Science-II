/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Abecedarian v1
 * @date Nov 6, 2015
 */
package abecedarian;
import java.util.*;
public class Abecedarian{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word;
        System.out.print("Enter a word: ");
        word = keyboard.nextLine();
        String inputArray[] = word.split("");
        int stringIndex = 1;
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int i = 0; i < alphabet.length; i++){
            if(stringIndex == inputArray.length){
                System.out.println("This string is abeceridarian");
                return;
            }
            if (inputArray[stringIndex].equals(alphabet[i])) {
                stringIndex++;
                i--;
            }
        }
        System.out.println("This string is NOT abeceridarian");
    }
}

