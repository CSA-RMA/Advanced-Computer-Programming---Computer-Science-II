/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name PasswordRandomizer
 * @date Jan 26, 2016
 * @comment 
 */
package password; 
public class Password { 
    public static void main(String[] args) { 
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    } 
} 