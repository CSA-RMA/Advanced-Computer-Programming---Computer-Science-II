public class Main {
    public static void main(String[] args) {
        Clock aclock = new Clock(23, 59, 50);
        int i = 0;
        while( i < 20) {
            System.out.println(aclock);
            aclock.tick();
            i++;
        }
    }
}
class Clock { 
    BoundedCounter hours=new BoundedCounter(23);
    BoundedCounter minutes=new BoundedCounter(59);
    BoundedCounter seconds=new BoundedCounter(59);
    Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }
    public void tick() {
        seconds.next();
        if(seconds.hasChanged()){
            minutes.next();
            if(minutes.hasChanged()){
                hours.next();
            }
        }
    }
    public String toString() {
        return this.hours.toString()+":"+this.minutes.toString()+":"+this.seconds.toString();
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