/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name removeLast v1
 */
package removelast;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.List;
public class RemoveLast {
    public static void main(String[] args) {
        List example=new ArrayList<String>(asList("this","is","lots","of","fun","for","every","Java","programmer"));
        System.out.printf("Original list: %s\n",example);
        List nolastexample=removeLast(example);
        System.out.printf("List without last object: %s\n",nolastexample);
        Collections.sort(example);
        List nolastexamplesorted=removeLast(example);
        System.out.printf("Sorted list without last object: %s\n",nolastexamplesorted);
    }
    public static List removeLast(List x) {
        List y=x;
        y.remove(y.size()-1);
        return y;
    }
}
