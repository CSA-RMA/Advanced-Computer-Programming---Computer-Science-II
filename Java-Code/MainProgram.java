/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name loginDraftCSA v0.3
 */
package main.program;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainProgram {
    public static void clearScreen() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public static void datePrint() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
    public static void businessInfo() {
        System.out.println("Chaparral Star Academy");
        System.out.println("14046 Summit Drive");
        System.out.println("Austin, TX 78728");
        System.out.println("512.947.4665");
    }
    public static void welcomeUser() {
        System.out.println("Welcome, user!");
    }
    public static void waitaSec() {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {
        businessInfo();
        waitaSec();
        System.out.println("");
        datePrint();
        waitaSec();
        System.out.println("");
        welcomeUser();
        waitaSec();
        waitaSec();
        waitaSec();
        clearScreen();
        
    }
    
}
