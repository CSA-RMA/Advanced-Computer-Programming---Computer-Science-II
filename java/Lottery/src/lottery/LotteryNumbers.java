/* Ryan
Chaparral Star
Lottery Numbers
26th of January 2016
Written to be used in Lottery.java*/

package lottery;
import java.util.ArrayList;
import java.util.Random;
public class LotteryNumbers 
        {
    private ArrayList<Integer> numbers ;
    private Random random=new Random() ;

    public LotteryNumbers() 
    {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>() ;
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers() ;
    }

    public ArrayList<Integer> numbers() 
    {
        return this.numbers ;
    }

    public void drawNumbers() 
    {
        
        for(int i=0;i<7;i++) 
        {
            this.numbers.add(random.nextInt(38)+1) ;
        }
    }

    public boolean containsNumber(int number) 
    {
        if(this.numbers.contains(number)) 
        {
            return true ;
        }
        return false ;
    }
}
