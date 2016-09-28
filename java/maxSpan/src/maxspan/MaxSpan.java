/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name MaxSpan v1
 * @date Nov 6, 2015
 */
package maxspan;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class MaxSpan {
    public static void main(String[] args) {
        List OrderedArrayList=new ArrayList<Integer>(asList(1, 2, 1, 1, 3));
        System.out.printf("Original list: %s \nMax span between two numbers: %s \n",OrderedArrayList,maxSpan(OrderedArrayList));
    }
    public static int maxSpan(List<Integer> x) {
        int maxspannum=0; 
        for (int i=0;i<x.size();i+=1) {
            int num=x.get(i);
            if (x.contains(num)) {
                int span=i-x.indexOf(num)+1;  // num has been found so find the span
                if (span>maxspannum) {
                    maxspannum = span; // if the span is greater, update the maximum.
                }
            }
        }
        return maxspannum;
    }
}