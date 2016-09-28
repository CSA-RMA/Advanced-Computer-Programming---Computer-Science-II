/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Time v1
 */
package time;
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hour,minute,second;
        hour=14;
        minute=45;
        second=32;
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.println(second);
        System.out.println("Seconds since midnight:");
        System.out.println((hour*60*60)+(minute*60)+second);
        System.out.println("Seconds until midnight:");
        System.out.println((24*60*60)-((hour*60*60)+(minute*60)+second));
        System.out.println("Percentage of day passed:");
        System.out.println(((((24*60*60)+(hour*60*60)+(minute*60)+second))*100/(24*60*60))-100);
    }
    
}
