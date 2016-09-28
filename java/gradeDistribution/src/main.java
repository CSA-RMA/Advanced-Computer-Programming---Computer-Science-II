import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        doSomething(scanner);
    }
    
    public static void doSomething(Scanner scanner) {
        int riw =0;
        ArrayList<Integer> numbers =new ArrayList<Integer>();
        while(riw!=-1) {
            riw =scanner.nextInt();
            if(riw>-1 && riw<61) {
                numbers.add(riw);
            }
        }
        double originalsize=numbers.size();
        System.out.printf("Grade Distribution: \n5: ");
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i)>=50) {
                System.out.print("*");
            }
        }
        System.out.print("\n");
        System.out.print("4: ");
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i)<50&&numbers.get(i)>=45) {
                System.out.print("*");
            }
        }
        System.out.print("\n");
        System.out.print("3: ");
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i)<45&&numbers.get(i)>=40) {
                System.out.print("*");
            }
        }
        System.out.print("\n");
        System.out.print("2: ");
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i)<40&&numbers.get(i)>=35) {
                System.out.print("*");
            }
        }
        System.out.print("\n");
        System.out.println("1: ");
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i)<35&&numbers.get(i)>=30) {
                System.out.print("*");
            }
        }
        System.out.print("\n");
        System.out.print("0: ");
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i)<30) {
                System.out.print("*");
                numbers.remove(i);
            }
        }
        System.out.printf("Acceptance percentage: %s\n",(100*numbers.size()/originalsize));

    }
    
}
