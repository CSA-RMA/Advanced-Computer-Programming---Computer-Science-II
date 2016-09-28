/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name $(name) v1
 */
package noyaklist;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class NoYakList {
    public static void main(String[] args) {
        List example=new ArrayList<>(asList("yak","bob","noyak","dak","yak","wak"));
        System.out.printf("Yak list: %s\n",example);
        ArrayList newexample=unluckyYaks(example);
        System.out.printf("No yak list: %s\n",newexample);
    }
    public static ArrayList unluckyYaks(List<String> x) { /* there wasn't a contains for multiples, so i just made one */
        ArrayList y=new ArrayList<>();
        for(int i=0;i<x.size();i+=1){ /* for every item in x */
            if (!(x.get(i).equals("yak"))) { /* if they don't have yak */
                y.add(x.get(i));
            }}
        return y;
}}