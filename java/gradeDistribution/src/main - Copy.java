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
        System.out.print("\n4: ");
        ArrayListprintfornuminbetween(numbers, 50, 45);
        System.out.print("\n3: ");
        ArrayListprintfornuminbetween(numbers, 45, 40);
        System.out.print("\n2: ");
        ArrayListprintfornuminbetween(numbers, 40, 35);
        System.out.println("\n1: ");
        ArrayListprintfornuminbetween(numbers, 35, 30);
        System.out.print("\n0: ");
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i)<30) {
                System.out.print("*");
                numbers.remove(i);
            }
        }
        System.out.printf("Acceptance percentage: %s\n",(100*numbers.size()/originalsize));
    }
    public static void ArrayListprintfornuminbetween(ArrayList<Integer> numbers, int i1, int i2) {
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i)<i1&&numbers.get(i)>=i2) {
                System.out.print("*");
            }
        }
    }
}
