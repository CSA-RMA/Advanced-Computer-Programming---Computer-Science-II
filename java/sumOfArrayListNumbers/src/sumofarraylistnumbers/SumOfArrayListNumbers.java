/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name sumOfArrayListNumbers v1
 */
package sumofarraylistnumbers;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class SumOfArrayListNumbers {
    public static void main(String[] args) {
        List example=new ArrayList<Integer>(asList(3,2,7,2));
        System.out.printf("Original List: %s\nSum of list: %s\n",example, sum(example));
    }
    public static int sum(List<Integer> x) {
        int y=0;
        for(int i=0;i<x.size();i+=1) {
            y+=x.get(i);
        }
        return y;
    }
}