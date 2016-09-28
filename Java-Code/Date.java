/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Date v1
 */
package date;
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String day,month;
        int daynum,year;
        day="Thursday";
        month="September";
        year=2015;
        daynum=11;
        System.out.println("American Format:");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(daynum);
        System.out.print(", ");
        System.out.println(year);
        System.out.println("Standard Format:");
        System.out.print(day);
        System.out.print(" ");
        System.out.print(daynum);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(", ");
        System.out.println(year);
    }
    
}
