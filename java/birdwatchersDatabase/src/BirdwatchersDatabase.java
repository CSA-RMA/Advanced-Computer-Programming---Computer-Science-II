import java.util.Scanner;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class BirdwatchersDatabase {
    public static void main(String[] args) {
        Scanner user_input= new Scanner(System.in);
        List<Bird> birdlist= new ArrayList<Bird>(asList());
        String answer="";
        while(!answer.equals("quit")) {
            System.out.print("? ");
            answer=user_input.next().toLowerCase();
            if(answer.equals("add")) {
                System.out.print("Name: ");
                String birdname=user_input.next().toLowerCase();
                System.out.print("Latin Name: ");
                Bird bird=new Bird(birdname, user_input.next().toLowerCase());
                birdlist.add(bird);
            }
            if(answer.equals("statistics")) {
                for(int i=0;i<birdlist.size();i++) {
                    System.out.printf("%s\n",birdlist.get(i));
                }
            }
            if(answer.equals("observation")) {
                System.out.print("What was observed:? ");
                String birdsname=user_input.next().toLowerCase();
                for(int i=0;i<birdlist.size();i++) {
                    if(birdlist.get(i).getName().equals(birdsname)) {
                        birdlist.get(i).observed();
                    } else {
                        System.out.println("Bird not found! ");
                    }
                }
            }
            if(answer.equals("show")) {
                System.out.print("What? ");
                String birdsname=user_input.next().toLowerCase();
                for(int i=0;i<birdlist.size();i++) {
                    if(birdlist.get(i).getName().equals(birdsname)) {
                        System.out.printf("%s\n",birdlist.get(i));
                    } else {
                        System.out.println("Bird not found! ");
                    }
                }
            }
        }
    }
}
class Bird {
    private String name;
    private String latinname;
    private int observations=0;
    public Bird(String name, String latinname) {
        this.name=name;
        this.latinname=latinname;
    }
    public void observed() {
        observations++;
    }
    public String toString() {
        return String.format("%s (%s), %s",name,latinname,observations);
    }
    public String getName() {
        return name;
    }
}