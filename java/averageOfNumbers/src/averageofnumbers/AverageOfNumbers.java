/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name averageOfNumbers v1
 */
package averageofnumbers;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class AverageOfNumbers {
    public static void main(String[] args) {
        List example=new ArrayList<Integer>(asList(3,2,7,2));
        System.out.printf("Average of list %s: \n%s\n",example,averageOfNumbers(example));
    }
    public static double averageOfNumbers(List<Integer> x) {
        double y=0;
        for(int i=0;i<x.size();i+=1) {
            y+=x.get(i);
        }
        return y/x.size();
    }
}