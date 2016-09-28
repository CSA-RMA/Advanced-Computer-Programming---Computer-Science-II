/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name lengthOfStrings v1
 */
package lengthofstrings;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class LengthOfStrings {
    public static void main(String[] args) {
        List example=new ArrayList<String>(asList("Hallo","Moi","Benvenuto!","badger badger badger badger"));
        System.out.printf("Original list: %s\n",example);
        List<Integer> newexample=lengthOfStrings(example);
        System.out.printf("List string lengths: %s\n",newexample);
    }
    public static List lengthOfStrings(List<String> x) {
        List y=x;
        for(int i=0;i<x.size();i+=1) {
            int z=x.get(i).length();
            y.set(i,z);
        }
        return y;
    }
}