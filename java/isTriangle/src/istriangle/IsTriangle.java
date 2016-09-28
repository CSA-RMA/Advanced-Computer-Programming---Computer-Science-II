/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name IsTriangle v1
 * @date Nov 6, 2015
 */
package istriangle;
import java.util.Scanner;
public class IsTriangle {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.printf("Enter the length of side one of the triangle: ");
        int x=user_input.nextInt();
        System.out.printf("Enter the length of side two of the triangle: ");
        int y=user_input.nextInt();
        System.out.printf("Enter the length of side three of the triangle: ");
        int z = user_input.nextInt();
        if (x+y<z) {
            System.out.printf("This isn't a triangle, because %s+%s<%s!\n",x,y,z);
        } else if (x+z<y){
            System.out.printf("This isn't a triangle, because %s+%s<%s!\n",x,z,y);
        } else if (y+z<x){
            System.out.printf("This isn't a triangle, because %s+%s<%s!\n",y,z,x);
        } else {
            System.out.printf("This is a triangle!");
        }
    }
}
