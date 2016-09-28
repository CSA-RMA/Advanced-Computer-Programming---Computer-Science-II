/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name TimeinTimeout v0.5
 */
package timeintimeout;
public class TimeinTimeout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intime,outtime,totaltime;
        intime=900;
        outtime=1700;
        totaltime=outtime-intime;
        System.out.println("Welcome, user!");
        System.out.print("Time in:");
        System.out.println(intime);
        System.out.print("Time out:");
        System.out.println(outtime);
        System.out.print("Total time worked:");
        System.out.println(totaltime);
        // TODO code application logic here
    }
    
}
