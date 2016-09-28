/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name switchInPairs v1
 */
package switchinpairs;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.List;
public class SwitchInPairs {
    public static void main(String[] args) {
        List example=new ArrayList<>(asList("a","c","n","e","f"));
        System.out.printf("List before switching pairs: %s\n",example);
        ArrayList newexample=switchPairs(example);
        System.out.printf("List after switching pairs: %s\n",newexample);
    }
    public static ArrayList switchPairs(List x) {
        ArrayList y=new ArrayList<>();
        for(int i=0;i+1<x.size();i+=2){ /* sets i to 0, then adds 2 unless i+1 is greater than x */
            y.add(x.get(i+1));
            y.add(x.get(i)); /* adds em to the list */
        }
        if (x.size()>y.size()) {
            y.add(x.get(x.size()-1));
        }
        return y;
    }
}