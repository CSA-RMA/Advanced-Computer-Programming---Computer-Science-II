/*
Daniel Herbowy
Mr Davis
Chaparral Star Academy
6/5/16
finalproject v.1
so far the base game is in place,
 */
package main;

/**
 *
 * @author dA
 */

import java.util.*;
import java.io.*;
import static java.lang.Math.random;
class Fighting {
               
}
class Weapon {
    private String name;
    private int damage;
    Weapon(String name, int damage){
        this.name=name;
        this.damage=damage;
    }
    public String returnName() {
        return name;
    }
    public int returnDamage() {
        return damage;
    }
}
public class Main {
    static void Fighting(String enemyname, double enemydamage, double enemyhealth) throws InterruptedException, FileNotFoundException, IOException {
        Scanner user_input=new Scanner(System.in);
        Random rand=new Random();
        Scanner reader = new Scanner(new File("finalprojectplayer.txt"));
        String playerstats="";
        while (reader.hasNextLine()){
            playerstats+=reader.nextLine()+"\n";
        }
        String[] playerstatsarray=playerstats.split("\n");
        double playerdamage=Double.parseDouble(playerstatsarray[0]);
        double totalhealth=Double.parseDouble(playerstatsarray[1]);
        int battlelength=0;
        while (enemyhealth>=0){
            battlelength++;
                int strength=1;
                double enemyattack=rand.nextDouble()*enemydamage;
                System.out.println("Do you want to attack fast, or strong?");
                String input=user_input.nextLine();
                double playerattack=rand.nextDouble()*strength*playerdamage;
                if(input.equals("fast")){
                    System.out.println("You attacked for "+playerattack+" damage !");
                    Thread.sleep(2000);
                    System.out.println(enemyname+" attacked for "+enemyattack+" damage !");
                } else {
                    strength=2;
                    System.out.println(enemyname+" attacked for "+enemyattack+" damage !");
                    Thread.sleep(2000);
                    System.out.println("You attacked for "+playerattack+" damage !");
                }
                enemyhealth=(enemyhealth-playerattack);
                totalhealth=(totalhealth-enemyattack);
                 Thread.sleep(2000);
                if (totalhealth<=0){
                    System.out.println("You died");
                System.exit(0);
                }
                
                System.out.println(totalhealth+" is your remaining health.");
             Thread.sleep(2000);
            
       
            
                    }
            System.out.println("You defeated "+enemyname+"!");
            FileWriter fppfw = new FileWriter("finalprojectplayer.txt");
            System.out.println("Would you like to use a health kit(1) or increase your damage(2)?");
            int advantage=user_input.nextInt();
            if(advantage==2) {
                playerdamage+=battlelength*rand.nextInt(5);
                System.out.println("Damage increased!");
                fppfw.write(String.valueOf(playerdamage)+"\n");
                fppfw.write(String.valueOf(totalhealth)+"\n");
            } else {
                totalhealth=100;
                System.out.println("Health restored!");
                fppfw.write(String.valueOf(playerdamage)+"\n");
                fppfw.write(String.valueOf(totalhealth)+"\n");
            }
            fppfw.close();
}

    public static void main(String[] args) throws Exception{

Scanner user_input=new Scanner(System.in);
    System.out.println("Hello!");
    
    System.out.print("What is your name? ");
    String user_name=user_input.nextLine();
    System.out.println("Hi "+user_name+"!");
    String characterpicked;
    nameloop:
        while(true){
            File file = new File("characters.txt");
            
            Scanner reader = new Scanner(file);
            
           System.out.println("The Classes are: Human, Brute, Bandito, Plebian");

           System.out.print("What class would you like to play as?(must be exact spelling) ");
    
            characterpicked=user_input.nextLine();
            while (reader.hasNextLine()){
                String num1=reader.nextLine();
            
                if(num1.toLowerCase().equals(characterpicked.toLowerCase())) {
                    System.out.println("You picked "+characterpicked);
                    break nameloop;
                }
            
            }
        }
    FileWriter fppfw = new FileWriter("finalprojectplayer.txt");
    //FileWriter wfw = new FileWriter("weapons.txt");
    Scanner weaponreader = new Scanner(new File("weapons.txt"));
    String weaponfile="";
    System.out.println("");
        while (weaponreader.hasNextLine()){
            String num1=weaponreader.nextLine();
            System.out.println(num1);
            weaponfile+=num1+"\n";
        }
        String[] weaponfilelines=weaponfile.split("\n");
        ArrayList<Weapon> weaponlist = new ArrayList<Weapon>();
        for(int i=0;i<weaponfilelines.length/2;i++) {
            Weapon aweapon = new Weapon(weaponfilelines[i*2],Integer.parseInt(weaponfilelines[i*2+1]));
            weaponlist.add(aweapon);
        }
        weaponloop:
        while(true){
            System.out.println("Please select a weapon: ");
            String weapon=user_input.nextLine();  
            for(int i=0;i<weaponlist.size();i++){
                if(weaponlist.get(i).returnName().toLowerCase().equals(weapon.toLowerCase())) {
                    System.out.println("You picked "+weaponlist.get(i).returnName());
                    fppfw.write(String.valueOf(weaponlist.get(i).returnDamage())+"\n");
                    fppfw.write(String.valueOf(100)+"\n");
                    fppfw.close();
                    break weaponloop;
                }
            }    
        }

        
        



    System.out.println("You were a farmer until one day the evil Spartals came to your farm to collect taxes. You grabbed the nearest weapon, and fended off the Spartals because you had enough of their repressive ways!");
    System.out.println("You swear to destroy the evil regime and bring justice to the land!!");
    System.out.println("And with that you set off to destroy down the evil king, Turtus.");
    

    System.out.println("Would you like to go to the city(1), or to the small town(2)?") ;     
    int town=user_input.nextInt();
        if (town==1){
        System.out.println("You decided to go towards the city.");
    }else{
        if (town==2){
        System.out.println("You decided to go towards the town.");

    }
}
    
    int totalhealth=100;
Random rand = new Random();  
int num11=rand.nextInt(2);
    if(num11==0){
        System.out.println("You made it into town safely");
    }else{
        if(num11==1){
            System.out.println("You were attacked on your way to town");

            

        int enemyhealth=35;
        
  
            Fighting("The Spider", 11, 35);
            System.out.println("You made it into town");
        }
    }

    System.out.println("Now that you are in town, would you like to heal(1) or move on toward the outpost(2)");
    int adventure=user_input.nextInt();
    if (adventure==1){
        System.out.println("You regain all of your health and begin moving towards the outpost");
        totalhealth=100;
    }else{
        System.out.println("You move towards the outpost");
}
    
            int enemyhealth=50;
 int random2=rand.nextInt(2);       
if (random2==0){  
    System.out.println("On you way to the outpost you were ambushed by hitmen");
            Fighting("The Hitmen", 20, 50);
}else{
    if(random2==1){
        System.out.println("You ade it to the outpost without being attacked");
    }
}
    
    System.out.println("You are at the outpost, would you like to stealthly retreive the map to the castle(1), or fight for it(2)?");
    
       
    int attacking=user_input.nextInt();
    if (attacking==1){
        System.out.println("You stealthly reteive the map to the castle and start going towards it");
       
    }else{
        System.out.println("You attack the outpost");
       
            Fighting("The Outpost Soldiers",30, 50);
            System.out.println("You recover the map!");
            
            
}
                int bosshealth=100;
       
                Fighting("King Turdus", 40, 100);
    
    
    
    }
    
    
    
    
    

    




}