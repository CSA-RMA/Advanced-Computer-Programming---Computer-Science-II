/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Main v1
 * @date Jan 11, 2016
 * @comment Shows off the Multiplier, Decreasing COunter, and Menu classes.
 */
package pkg11116;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        /* Multiplier */
        Multiplier three=new Multiplier(3);
        Multiplier four=new Multiplier(4);
        System.out.printf("Multiplier: \nthree.multiply(2)=%s\nfour.multiply(2)=%s\nthree.multiply(1)=%s\nfour.multiply(1)=%s\n\nDecreasing Counter:\n",three.multiply(2),four.multiply(2),three.multiply(1),four.multiply(1));
        Thread.sleep(1000);
        /* Decreasing Counter */
        DecreasingCounter counter = new DecreasingCounter(100);
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.reset();
        counter.printValue();
        counter.setInitial();
        counter.printValue();
        Thread.sleep(1000);
        /* Menu */
        System.out.printf("\nMenu:\n");
        Menu menu=new Menu();
        menu.addMeal("Chicken");
        menu.addMeal("Pizza");
        menu.addMeal("Pizza");
        menu.addMeal("Pizza");
        menu.printMeals();
        menu.clearMenu();
        menu.printMeals();
    }
}
class Multiplier{
    int number;
    public Multiplier(int number){
        this.number=number;
    }
    public void Multiplier(){
        this.number=1;
    }
    public int multiply(int otherNumber){
        return this.number*otherNumber;
    }
}
class DecreasingCounter{
    private int value;
    private int valueAtStart;
    public DecreasingCounter(int valueAtStart){
        this.value=valueAtStart;
        this.valueAtStart=valueAtStart;
    }
    public void printValue(){
        System.out.printf("Value: %s\n",this.value);
    }
    public void decrease(){
        if(this.value>=1) {
            this.value=this.value-1;
        }
    }
    public void reset(){
        this.value=0;
    }
    public void setInitial(){
        this.value=this.valueAtStart;
    }
}
class Menu {
    private ArrayList<String> meals;
    public void Menu(ArrayList<String> ameal) {
        this.meals = ameal;
    }
    public Menu() {
        this.meals = new ArrayList<String>();
    }
    public void addMeal(String meal){
        if(!this.meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    public void printMeals(){
        for(int i=0;i<this.meals.size();i+=1){
            System.out.printf("%s\n",this.meals.get(i));
        }
    }
    public void clearMenu(){
        this.meals = new ArrayList<String>();
    }
}
