/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name CountCharacters v1
 * @date Nov 6, 2015
 */
package countcharacters;
import java.util.Scanner;
import java.util.ArrayList;
public class CountCharacters {
    public static void main(String[] args) {
        int num=0;
        System.out.printf("Enter a string: ");
        Scanner user_input=new Scanner(System.in);
        String word=user_input.nextLine();
        System.out.printf("Enter the letter you would like to search for: ");
        String search=user_input.nextLine();
        int x=-1;
        do {
            x=word.indexOf(search, x+1);
            if (x>-1){
                num=x;
            } else {
                break;
            }
        } while(x>=0);
        System.out.printf("%s was found in %s %s times!\n",search,word,x); 
    }
}
