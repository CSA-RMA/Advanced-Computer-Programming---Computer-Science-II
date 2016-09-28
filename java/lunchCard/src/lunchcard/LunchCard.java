/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name LunchCard v1
 * @date Jan 14, 2016
 * @comment Runs lunchcard program
 */
package lunchcard;
import java.util.Scanner;
public class LunchCard {
    public static void main(String[] args) {
        String cardname="howdy there mr. davis";
        BevoCard pekka=new BevoCard(0);
        BevoCard brian=new BevoCard(0);
        Scanner user_input=new Scanner(System.in);
        while(true){
            System.out.printf("\nPlease enter the name of the card user: ");
            cardname=user_input.next();
            if("brian".equals(cardname.toLowerCase())){
                System.out.printf("1. Add balance to card\n2. Use card to purchase food\nPlease enter the number of the option you would like: ");
                String option=user_input.next();
                if("1".equals(option)){
                    System.out.printf("Please enter how much to add to the card: ");
                    double bal=user_input.nextDouble();
                    brian.loadMoney(bal);
                    System.out.printf("%s has been added\n%s",bal,brian);
                } else if("2".equals(option)){
                    System.out.printf("Economical: $2.50\nGourmet: $4.00\nPlease enter the name or letter of food type you would like: ");
                    option=user_input.next();
                    if(option.equals("e")||option.equals("economical")){
                        brian.payEconomical();
                        System.out.printf("Economical purchased, removing $2.50 from balance\n%s\n\n",brian);
                    }
                    if(option.equals("g")||option.equals("gourmet")){
                        brian.payGourmet();
                        System.out.printf("Gourmet purchased, removing $4.00 from balance\n%s\n\n",brian);
                    }
                }
            }else if("pekka".equals(cardname.toLowerCase())){
                System.out.printf("1. Add balance to card\n2. Use card to purchase food\nPlease enter the number of the option you would like: ");
                String option=user_input.next();
                if("1".equals(option)){
                    System.out.printf("Please enter how much to add to the card: ");
                    double bal=user_input.nextDouble();
                    pekka.loadMoney(bal);
                    System.out.printf("%s has been added\n%s",bal,pekka);
                } else if("2".equals(option)){
                    System.out.printf("Economical: $2.50\nGourmet: $4.00\nPlease enter the name or letter of food type you would like: ");
                    option=user_input.next();
                    if(option.equals("e")||option.equals("economical")){
                        pekka.payEconomical();
                        System.out.printf("Economical purchased, removing $2.50 from balance\n%s\n\n",pekka);
                    }
                    if(option.equals("g")||option.equals("gourmet")){
                        pekka.payGourmet();
                        System.out.printf("Gourmet purchased, removing $4.00 from balance\n%s\n\n",pekka);
                    }
                }
            }
        }
    }
}
class BevoCard {
    private double balance;
    public BevoCard(double balanceAtStart) {
        this.balance=balanceAtStart;
    }
    BevoCard() {
        this.balance=0;
    }
    public String toString() {
        String test="";
        return ("This card has a balance of "+balance);
    }
    public void payEconomical() {
        if(this.balance>=2.5){
            this.balance=this.balance-2.5;
        }
    }
    public void payGourmet() {
        if(this.balance>=4){
            this.balance=this.balance-4;
        }
    }
    public void loadMoney(double amount) {
        this.balance=this.balance+amount;
    }
    public double returnBalance(){
        return this.balance;
    }
}
