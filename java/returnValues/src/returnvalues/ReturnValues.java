/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name ReturnValues v1
 * @date Dec 11, 2015
 * @comment Returns the median of a set of numbers.
 */
package returnvalues;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ReturnValues {
    public static boolean isInteger( String input ) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
    public static Object median(List<Integer> numlist) {
        return numlist.get(numlist.size()/2);
    }
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        String inum="0";
        List numlist=new ArrayList<Integer>(asList());
        while(isInteger(inum)) {
            System.out.printf("Please enter a number to add: (hint: enter anything other than a number to end the list!) ");
            inum=user_input.next();
            if (isInteger(inum)) {
                numlist.add(inum);
            } else {
                break;
            }
        }
        Collections.sort(numlist);
        if (numlist.size()<=1) {
            System.out.printf("There aren't enough numbers to find a median of! \n");
        } else {
            System.out.printf("The median of all the numbers you entered is %s! \n",median(numlist));
        }
    }
}