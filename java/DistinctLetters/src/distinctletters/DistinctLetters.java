/*  Ryan 
    Chaparral Star Academy
    Janu 28th 2016 
    Checks if a string has duplicate characters */
package distinctletters;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class DistinctLetters {
    
    private static String checkIfDistinctLettering(String input){
        
        List list=new ArrayList<String>(asList(input.toLowerCase().split("")));
        Set<String> set = new HashSet<String>(list);
        if(set.size() < list.size()){
            
            return "DOES NOT USE DISTINCT LETTERS";
        }
        return "USES DISTINCT LETTERS";
    }
    
    public static void main(String[] args) {
        
        System.out.println("UNCOPYRIGHTABLE " + checkIfDistinctLettering("uncopyrightable"));
        System.out.println("FLIPPER " + checkIfDistinctLettering("flipper"));
        System.out.println("EXECUTABLE " + checkIfDistinctLettering("executable"));
        System.out.println("UNPROFITABLE " + checkIfDistinctLettering("unprofitable"));
        System.out.println("QUESTIONABLY " + checkIfDistinctLettering("questionably"));
        System.out.println("WINDOW " + checkIfDistinctLettering("window"));
        System.out.println("TAMBOURINE " + checkIfDistinctLettering("tambourine"));
    }
}