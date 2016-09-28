/* Author: Ryan! */
/* Written for express use by: Chaparral Star Academy! */
/* Program Name: Rolling V1! */
/* Used to roll a virtual set of dice without graphics! */
package rolling;
public class Rolling {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }
    }
}