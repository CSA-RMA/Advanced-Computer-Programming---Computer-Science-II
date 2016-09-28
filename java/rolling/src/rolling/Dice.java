/*
 * @author ryanames
 * @name dice v1
 * @date Jan 25, 2016
 * @comment rolls a virtual pair of dice
 */
package rolling;
import java.util.Random;
public class Dice{
    private  Random random;
    private  int numberOfSides;

    public  Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int  roll(){ return random.nextInt( this.numberOfSides ) + 1 ; }
}
