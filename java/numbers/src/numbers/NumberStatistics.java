// Written by Ryan Ames For Chaparral Star Academy: NumberStatistics v1, Created Jan 21, 2016: Shows statistics of numbers entered by the user
package numbers;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;

public class NumberStatistics 
{
    private List numlist=new ArrayList<Double>(asList());
    private int amountOfNumbers=numlist.size();
    private double sum;
    private double average;

    public void addNumber(double number) 
    {
        numlist.add(number);
        this.amountOfNumbers=numlist.size();
    }

    public int amountOfNumbers() 
    {
        return this.amountOfNumbers;
    }

    public double sum() 
    {
        for (int i=0;i<numlist.size();i+=1)
        {
            sum=sum+(double)numlist.get(i);
        }
        return sum;
    }

    public double average() 
    {
        
        for (int i=0;i<numlist.size();i+=1){
            average=average+(double)numlist.get(i);
        }
        average=average/numlist.size();
        return average;
    }
}
