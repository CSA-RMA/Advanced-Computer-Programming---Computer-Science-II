/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name noDuplicates v1
 * @date Nov 5, 2015
 */
package noduplicates;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class NoDuplicates {
    public static void main(String[] args) {
        List OrderedArrayList=new ArrayList<Integer>(asList(2,2,2,2,5,5,8,9,9,9));
        System.out.printf("Ordered list with duplicates: %s\n",OrderedArrayList);
        removeDuplicates(OrderedArrayList);
        System.out.printf("Ordered list without duplicates: %s\n",OrderedArrayList);
    }
    public static void removeDuplicates(List<Integer> x) {
        for(int i=0;i<x.size();i+=1) {
            for(int o=i+1;o<x.size();o+=1) {
                if(x.get(i).equals(x.get(o))) {
                    x.remove(o);
                    i=0;
                    o=i;
                }
            }
        }
    }
}