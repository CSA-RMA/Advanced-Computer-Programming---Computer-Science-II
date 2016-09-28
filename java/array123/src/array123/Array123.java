/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name array123 v1
 */
package array123;
import java.util.ArrayList;
import java.util.Scanner;
public class Array123 {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<Integer>();
        int num=0;
        for (int i=0;i<6;i+=1) { /* while i is less than 7 */
            System.out.printf("Please enter a number: ");
            num=user_input.nextInt();
            array.add(num);  /* add the num to the arraylist */
        }
        if (array123(array)) {
        System.out.printf("1, 2, 3 occured in the ArrayList %s \n",array);    
        } else {
            System.out.printf("1, 2, 3 hasn't occured in the ArrayList %s \n",array);
        }
    }
    public static boolean array123(ArrayList<Integer> x) { /* there wasn't a contains for multiples, so i just made one */
        for(int i=0;i+2<x.size();i+=1){ /* for every item in x except the last two */
            if (x.get(i)==1 && x.get(i+1)==2 && x.get(i+2)==3) { /* if they contain the set 1, 2, 3 */
                return true;
            }
        }
        return false;
    }
}
