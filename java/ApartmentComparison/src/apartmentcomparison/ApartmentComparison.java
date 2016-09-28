/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name ApartmentComparison v1
 * @date Feb 19, 2016
 * @comment 
 */
package apartmentcomparison;
public class ApartmentComparison {
    public static void main(String[] args) {
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
        System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );
        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );
        System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );
    }
}
class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public int size(){
        return this.squareMeters;
    }
    public int price(){
        return this.squareMeters*this.pricePerSquareMeter;
    }

    public boolean larger(Apartment twoRoomsBrooklyn){
        if(this.size()>twoRoomsBrooklyn.size()){
            return true;
        }
        return false;
    }

    int priceDifference(Apartment twoRoomsBrooklyn) {
        if(this.price()>twoRoomsBrooklyn.price()){
            return this.price()-twoRoomsBrooklyn.price();
        }
        return twoRoomsBrooklyn.price()-this.price();
    }

    boolean moreExpensiveThan(Apartment twoRoomsBrooklyn) {
        if(this.price()>twoRoomsBrooklyn.price()){
            return true;
        }
        return false;
    }
}