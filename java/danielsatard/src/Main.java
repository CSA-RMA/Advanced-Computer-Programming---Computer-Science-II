/*
Daniel Herbowy
Mr. Davis
Chaparral Star Academy
5/20/16
finalproject v.3
The game is an arena fighter with stats and levels, will let you exit at level 10 or continue battleing
 */
import java.util.*;
import java.io.*;
class Fighting {
    Fighting(String enemyname, double enemydamage, double enemyhealth) throws InterruptedException, FileNotFoundException, IOException {
        System.out.println(enemyname+" attacks you!");
        Scanner user_input=new Scanner(System.in);
        Random rand=new Random();
        int orighealth=(int) enemyhealth;
        Scanner reader = new Scanner(new File("finalprojectplayer.txt"));
        String playerstats="";
        while (reader.hasNextLine()){
            playerstats+=reader.nextLine()+"\n";
        }
        String[] playerstatsarray=playerstats.split("\n");
        int playerdamage=(int) Double.parseDouble(playerstatsarray[0]);
        int totalhealth=(int) Double.parseDouble(playerstatsarray[1]);
        int battlelength=0;
        while (enemyhealth>=0){
            battlelength++;
                int strength=1;
                int enemyattack=(int)((rand.nextDouble()+.5)*enemydamage);
                String input="";
                while(true){
                    System.out.println("How do you want to attack? fast, or strong?");
                    input=user_input.next().toLowerCase().trim();
                    
                    if(input.equals("fast")||input.equals("strong")){
                        
                        break;
                    }else{
                        System.out.println("That is not a valid input. Please try again");
                    }
                }
                int playerattack=(int) ((rand.nextDouble()+.5)*strength*playerdamage);
                if(input.contains("fast")){
                    enemyhealth=(enemyhealth-playerattack);
                totalhealth=(totalhealth-enemyattack);
                    System.out.println("You attacked for "+playerattack+" damage !");
                    Thread.sleep(500);
                    if(enemyhealth<=0){
                        enemyattack=0;
                        break;
                    }else{
                        System.out.println(enemyname+" attacked for "+enemyattack+" damage !");
                    }
                } else {
                    strength=2;
                    playerattack=(int) (rand.nextDouble()*strength*playerdamage);
                    enemyhealth=(enemyhealth-playerattack);
                totalhealth=(totalhealth-enemyattack);
                System.out.println("You attacked for "+playerattack+" damage !");
                    
                    
                    Thread.sleep(500);
                    if(enemyhealth<=0){
                        enemyattack=0;
                        break;
                    }else{
                        System.out.println(enemyname+" attacked for "+enemyattack+" damage !");
                    }
                }
                if(enemyattack>(enemydamage/3)*2+10||playerattack>(playerdamage/3)*2+10){
                    System.out.println("Critical attack! ");
                }
                
                 Thread.sleep(500);
                if (totalhealth<=0){
                    System.out.println("You died");
                    System.exit(0);
                }
                
                
                System.out.println(totalhealth+" is your remaining health.");
                System.out.println("The enemy's is "+enemyhealth);
             Thread.sleep(500);
            
       
            
                    
        }
            System.out.println("You defeated "+enemyname+"!");
            FileWriter fppfw = new FileWriter("finalprojectplayer.txt");
            System.out.println("Would you like to use a health kit(1) or increase your damage(2)?");
            String advantage=user_input.next();
            
            if(advantage.equals("2")) {
                playerdamage+=(battlelength+2)*((rand.nextInt(2)+1)*(orighealth-5)/6);
                System.out.println("Damage increased to "+playerdamage+"!");
                fppfw.write(String.valueOf(playerdamage)+"\n");
                fppfw.write(String.valueOf(totalhealth)+"\n");
            } else {
                totalhealth+=(battlelength+2)*((rand.nextInt(2)+1)*(orighealth-5)/3);
                System.out.println("Health restored to "+totalhealth+"!");
                fppfw.write(String.valueOf(playerdamage)+"\n");
                fppfw.write(String.valueOf(totalhealth)+"\n");
            }
            fppfw.close();
    }
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
public class Main{
    public static String capitalize(String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }
    
    public static void main(String[] args) throws Exception{
    Scanner user_input=new Scanner(System.in);
    System.out.println("Welcome to the arena!");
    System.out.println("Here you will battle enemies until level 10 or die trying!");
    System.out.print("What is your name? ");
    String user_name=user_input.next();
    System.out.println("Hi "+user_name+"!");
    String characterpicked;
    nameloop:
        while(true){
            File file = new File("characters.txt");
            
            Scanner reader = new Scanner(file);
            
           System.out.println("The Classes are: Human, Brute, Bandito, Plebian");

           System.out.print("What class would you like to play as? ");
    
            characterpicked=user_input.next();
            while (reader.hasNextLine()){
                String num1=reader.nextLine();
            
                if(num1.toLowerCase().equals(characterpicked.toLowerCase().trim())) {
                    System.out.println("You picked "+characterpicked);
                    break nameloop;
                }
            
            }
        }
    FileWriter fppfw = new FileWriter("finalprojectplayer.txt");

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
        Random rand = new Random();  
        double totalhealth=100;
        int level=1;
        while(totalhealth>0){
            System.out.println("Moving to level "+level+"!");
            Scanner reader = new Scanner(new File("finalprojectplayer.txt"));
            Scanner names = new Scanner(new File("names.txt"));
            Scanner adjectives = new Scanner(new File("adjectives.txt"));
            String playerstats="";
            ArrayList<String> stringnames=new ArrayList();
            ArrayList<String> stringadjectives=new ArrayList();
            while (reader.hasNextLine()){
                playerstats+=reader.nextLine()+"\n";
            }
            while (names.hasNextLine()){
                stringnames.add(names.nextLine());
            }
            while (adjectives.hasNextLine()){
                stringadjectives.add(adjectives.nextLine());
            }
            String[] playerstatsarray=playerstats.split("\n");
            totalhealth=Double.parseDouble(playerstatsarray[1]);
            Fighting fighting=new Fighting(capitalize(stringadjectives.get(rand.nextInt(stringadjectives.size()-1))+" "+stringnames.get(rand.nextInt(stringnames.size()-1))).trim(),(level+5)*3,(level+5)*5);
            level++;
            String aninput="";
            if(level%10==0){
                System.out.println("Would you like to continue playing?(yes, no) ");
                aninput=user_input.nextLine().toLowerCase().trim();
                aninput=user_input.nextLine().toLowerCase().trim();
                if(aninput.equals("no")){
                    System.out.println("you exit the arena a winner!");
                    System.exit(0);
                }
            }
        }
        System.out.println("You have died! Game over! Final level beaten: "+(level-1));
    }
}

