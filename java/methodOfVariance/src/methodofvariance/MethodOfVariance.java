/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name methodOfVariance v1
 */
package methodofvariance;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class MethodOfVariance {
    public static void main(String[] args) {
        List example=new ArrayList<Integer>(asList(3,2,7,2));
        System.out.printf("Average of list %s: \n%s\n",example,averageOfNumbers(example));
        System.out.printf("The variance of the list is %s\n",methodOfVariance(example, averageOfNumbers(example)));
    }
    public static double averageOfNumbers(List<Integer> x) {
        double y=0;
        for(int i=0;i<x.size();i+=1) {
            y+=x.get(i);
        }
        return y/x.size();
    }
    public static double methodOfVariance(List<Integer> x, double z) {
        double y=0;
        for(int i=0;i<x.size();i+=1) {
            y+=(x.get(i)-z)*(x.get(i)-z);
        }
        return y/x.size();
    }
}