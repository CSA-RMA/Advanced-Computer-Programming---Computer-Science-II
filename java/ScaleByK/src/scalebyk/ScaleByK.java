/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name ScaleByK v1
 * @date Nov 5, 2015
 */
package scalebyk;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class ScaleByK {
    public static void main(String[] args) {
        List UnorderedArrayList=new ArrayList<Integer>(asList(3,2,7,-3,0,6));
        ArrayList<Integer> noNegatives = new ArrayList<Integer>();
        int num1=(UnorderedArrayList.size());
        int num2=0;
        while (num1>num2){
            int num3=(int) UnorderedArrayList.get(num2);
            if (num3>0){
                noNegatives.add(num3);
            }
            num2++;
        }
        System.out.println(noNegatives);
    }
}
