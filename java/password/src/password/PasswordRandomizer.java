/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name PasswordRandomizer
 * @date Jan 26, 2016
 * @comment 
 */
package password;

import java.util.Random;

public class PasswordRandomizer {
    int passlength;
    Random rand=new Random();
    PasswordRandomizer(int i) {
        this.passlength=i;
    }
    String createPassword() {
        String password="";
        for(int i=0;i<this.passlength;i++){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(rand.nextInt(25));
            password+=symbol;
        }
        return password;
    }
    
}
