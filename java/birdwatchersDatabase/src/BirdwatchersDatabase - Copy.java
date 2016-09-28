/* don't turn it in like this otherwise davis will get mad because he doesn't get the dick and butt jokes */
import java.util.Scanner;
import java.util.ArrayList;
public class BirdwatchersDatabase {
    public static void main(String[] args) {
        Scanner entermyasshole= new Scanner(System.in);
        ArrayList<ArrayList> shitdicks= new ArrayList<ArrayList>();
        String penetrated="";
        while(!penetrated.equals("quit")) {
            System.out.print("? ");
            penetrated=entermyasshole.next().toLowerCase().trim();
            if(penetrated.equals("add")) {
                ArrayList dick=new ArrayList();
                System.out.print("Name: ");
                dick.add(entermyasshole.next());
                System.out.print("Latin Name: ");
                dick.add(entermyasshole.next());
                dick.add(0);
                shitdicks.add(dick);
            }
            if(penetrated.equals("observation")) {
                System.out.print("What was observed:? ");
                String dicksname=entermyasshole.next();
                for(int i=0;i<shitdicks.size();i++) {
                    if(shitdicks.get(i).get(0).equals(dicksname)) {
                        shitdicks.get(i).set(2,(int)shitdicks.get(i).get(2)+1);
                    } 
                    System.out.println("Bird not found! ");
                }
            }
            if(penetrated.equals("statistics")) {
                for(int i=0;i<shitdicks.size();i++) {
                    System.out.printf("%s (%s): %s observations \n",shitdicks.get(i).get(0),shitdicks.get(i).get(1),shitdicks.get(i).get(2));
                }
            }
            if(penetrated.equals("show")) {
                System.out.print("What? ");
                String dicksname=entermyasshole.next();
                for(int i=0;i<shitdicks.size();i++) {
                    if(shitdicks.get(i).get(0).equals(dicksname)) {
                        System.out.printf("%s (%s): %s observations \n",shitdicks.get(i).get(0),shitdicks.get(i).get(1),shitdicks.get(i).get(2));
                    } 
                    System.out.println("Bird not found! ");
                }
            }
        }
    }
}