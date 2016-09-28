/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Clock
 * @date Jan 20, 2016
 * @comment Runs a simple clock program that does not end.
 */
package eternalclock; 
import java.util.Scanner;
public class EternalClock { 
    public static void main(String[] args) throws InterruptedException { 
        Scanner user_input = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(11);
        
        int inputseconds=0;int inputminutes=0;int inputhours=0;boolean am=true;
        while(inputseconds<=0||inputseconds>59||inputminutes<=0||inputminutes>59||inputhours<=0||inputhours>11){
            System.out.print("seconds: ");
            inputseconds=user_input.nextInt();
            System.out.print("minutes: ");
            inputminutes=user_input.nextInt();
            System.out.print("hours: ");
            inputhours=user_input.nextInt();
            System.out.print("is am (y/n):");
            String check=user_input.next();
            if(check.toLowerCase().equals("y")||check.toLowerCase().equals("yes")||check.toLowerCase().equals("t")||check.toLowerCase().equals("true")){
                am=true;
            }else {
                am=false;
            }
        }
        seconds.setValue(inputseconds);
        minutes.setValue(inputminutes);
        hours.setValue(inputhours);
        
        while (true) {
            System.out.printf("%s:%s:%s",hours,minutes,seconds);
            if(am){
                System.out.printf("AM\n");
            }else{
                System.out.printf("PM\n");
            }
            seconds.next();
            Thread.sleep(1000);
            if(seconds.hasChanged()){
                minutes.next();
                if(minutes.hasChanged()){
                    hours.next();
                    if(hours.hasChanged()){
                        am^=am;
                    }
                }
            }
        }
    } 
} 
class BoundedCounter{
    int numcount;
    int numcounttop;
    boolean justchanged;
    public BoundedCounter(int i) {
        this.numcounttop=i;
    } 
    public void next(){
        if (this.numcount<this.numcounttop){
            this.numcount++;
            this.justchanged=false;
        } else {
            this.numcount=0;
            this.justchanged=true;
        }
    }
    public void setValue(int s) {
        this.numcount=s;
    }
    public String toString(){
        return Integer.toString(this.numcount);
    }
    public int toInteger(){
        return this.numcount;
    }
    public boolean hasChanged(){
        return this.justchanged;
    }
}