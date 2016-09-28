/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name TimeCalc v1
 * @date Nov 5, 2015
 */
package timecalc;
public class TimeCalc {
    public static void main(String[] args) {
        int hour=20*3600;
        int minutes=40*60;
        int seconds=21;
        int timeremain=86400;
        int timepast=0;
        timeremain-=hour+minutes+seconds;
        timepast+=hour+minutes+seconds;
        System.out.printf("Seconds since midnight: %s\nSeconds remaining in the time: %s\n",timepast,timeremain);
    }
}