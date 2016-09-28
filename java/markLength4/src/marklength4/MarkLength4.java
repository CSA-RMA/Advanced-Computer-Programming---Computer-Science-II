/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name markLength4 v1
 */
package marklength4;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class MarkLength4 {
    public static void main(String[] args) {
        List example=new ArrayList<String>(asList("this","is","lots","of","fun","for","every","Java","programmer"));
        ArrayList newexample=markLength4(example);
        System.out.printf("Original list: %s \nNew list: %s\n",example,newexample);
    }
    public static ArrayList markLength4(List<String> x) {
        ArrayList y=new ArrayList<>();
        for(int i=0;i<x.size();i+=1){ /* for every item in x */
            if (((x.get(i)).length()==4)) { /* if its length is 4 */
                y.add("****");
            }
        y.add(x.get(i));
        }
        return y;
    }
}
