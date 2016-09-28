/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name MyCar v1
 * @date Dec 1, 2015
 */
package mycar;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;
public class MyCar {
    public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
        }          
        return sb.toString().trim();
    } 
    public static void main(String[] args) {
        Car acar=new Car();
        Scanner user_input=new Scanner(System.in);
        List carlist=new ArrayList<>(asList());
        String answer="";
        System.out.printf("Please enter your name: ");
        String name=user_input.next();
        while (!"no".equals(answer) && !"no ".equals(answer)){
            List manufacturers=new ArrayList<String>(asList("Acura","A.D. Tramontana","Alfa Romeo","Amuza","Anteros","Arash","Ariel","Arrinera","Ascari","ASL","Aston Martin","Audi","B Engineering","BAC","Bajaj","Beijing Automobile Works","Bentley","Bertone","BMW","Bollore","Bolloré","Brilliance","HuaChen","Bristol","BRM Buggy","Brooke","Buddy","Bufori","Bugatti","Buick","BYD","Cadillac","Caparo","Chang'an","Changhe","Chery","Chervrolet","Chevron","Citroen","Citroën","Chrysler","Commuter Cars","Commuter","Connaught","Covini","Dacia","Daihatsu","De La Chapelle","DMC","Devon","Diardi","Dodge","Donkervoort","Dongfeng","DS Automobiles","Dynasti Electric Cars","Egy-Tech Engineering","Egy Tech Enginnering","Egy-Tech","Egy Tech","Electric Raceabout","Elfin","Emgrand","Englon","Eterniti","Etox","Equus","Exagon","Faralli & Mazzanti","FAW","Ferrari","Fiat","Fisker","Foday","Force","Ford","Ford Austrailia","Ford Germany","Fornassari","Geebly","Gibbs","Gillet","Ginetta","Gleagle","GMC","Gonow","Great Wall","Changcheng","Grinnall","GTA Motor","Gumpert","Hafei","Hindustan","Holden","Honda","Hongqi","Hradyesh","HTT Technologies","HTT","Hulme","Hyudai","ICML","IFR","Iran Khodro","IKCO","Imperia","Infiniti","IVM","Invicta","Isdera","Isuzu","JAC","Jaguar","Jeep","Jetcar","Jonway","JOSS","Kaipan","Koenigsegg","Korres","Kia","Kiat","Kish Khodro","KTM","Lada","Lamborghini","Lancia","Land Rover","Landwind","Laraki","Leblanc","Leopard","Lexus","Li-ion","Liion","Lifan","Lightning","Lincoln","Lister","Local Motors","Loboni","Lotec","Lotus Cars","Luxgen","Mahindra","Mauruti Suzuki","Maserati","Mastretta","Mazda","Mclaren","Mercedes-Benz","Mercedes Benz","MG","Micro","MINI","Mitsubishi","Mitsuoka","Morgan","Mullen","Mycar","Nissan","Noble","Nota","Nash Motors","Nash","Opel","Optimal Energy","Orca","Pagani","Panoz","Perana","Perodua","Peugeot","P.G.O.","PGO","Polarsun","Porsche","Proto","Oullim","Proton","Qoros","Radical","Renault","REVA","Rimac","Rinspeed","Roding","Roewe","Rolls-Royce","Rolls Royce","Rossion","Saab","SAIC-GM-WULING","SAIC GM WULING","SAIPA","Saker","Samsung","San","Sbarro","SEAT","Shanghai Maple","Shelby Supercars","Sin","Skoda","Škoda","Smart","Spada Vetture Sport","Spyker","Street & Racing Technology","Ssangyong","Subaru","Suzuki","Tata","Tauro","Tawon Car","TD Cars","Tesla","Toyota","Trident","Troller","Trumpchi","TVR","Ultima","UEV","Uri","Vector","Vencer","Venturi","VEPR","Volkswagen","Volvo","Vauxhall Motors","W Motors","Wallyscar","Wesfield","Wheego","Wiesmann","YES","YES!","Zil","Zx Auto"));
            System.out.printf("Please enter the year of your car: ");
            int year=user_input.nextInt();
            while (year<1886 || year>2016) {
                System.out.printf("Please enter a year between 1886 and 2016!\nPlease enter the year of your car: ");
                year=user_input.nextInt();
            }
            System.out.printf("Please enter the manufacturer of your car: ");
            String manufacturer=user_input.next();
            while (!manufacturers.contains(manufacturer) && !manufacturers.contains(manufacturer.toUpperCase()) && !manufacturers.contains(toTitleCase(manufacturer))) {
                System.out.printf("Please enter a real manufacturer!\nPlease enter the manufacturer  of your car: ");
                manufacturer=user_input.next();
            }
            System.out.printf("Please enter the model of your car: ");
            String model=user_input.next();
            System.out.printf("Please enter the color of your car: ");
            String color=user_input.next();
            System.out.printf("Please enter the mpg of your car: ");
            double mpg=Math.abs(user_input.nextDouble());
            System.out.printf("Please enter the cost of your car: ");
            double cost=Math.abs(user_input.nextDouble());
            acar.makeCar(year,manufacturer,model,color,mpg,cost);
            if (!carlist.contains(acar.returnCar(name))) {
                carlist.add(acar.returnCar(name));
                acar.printCar(name);
                System.out.printf("Would you like to create another car? ");
                answer=user_input.next().toLowerCase();
                if (answer.equals("list")) {
                    System.out.printf("\n%s\n\n",carlist); /* prints list */
                }
            } else {
                System.out.printf("\n\nThis car is already in the list! \n\n\n");
            }
        }
        for(int i=0;i<carlist.size();i++) {
            List test=(List) carlist.get(i);
            System.out.printf("\nCar %s: %s %s %s colored %s with a mpg of %s selling/sold at %s \n",i+1,test.get(1),test.get(0),test.get(2),test.get(3),test.get(4),test.get(5));
        }
        System.out.printf("Goodbye! \n");
    }
}
class Car {
    int year;
    String manufacturer;
    String model;
    String color;
    double mpg;
    double cost;
    public void makeCar(int year,String manufacturer,String model,String color,double mpg,double cost) {
        this.year=year;
        this.manufacturer=manufacturer;
        this.model=model;
        this.color=color;
        this.mpg=mpg;
        this.cost=cost;
    }
    public List returnCar(String name) {
        List carspecs=new ArrayList<>(asList(this.year,this.manufacturer,this.model,this.color,this.mpg,this.cost));
        return carspecs;
    }
    public void printCar(String name) {
        System.out.printf("%s, you've entered a car that has the following specifications; \n\tColor: %s\n\tManufacturer: %s\n\tModel: %s\n\tYear: %s\n\tMPG: %s\n\tCost: %s\n",name,this.color,this.manufacturer,this.model,this.year,this.mpg,this.cost);
    }
}