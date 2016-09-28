/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Lolidk v1
 * @date Feb 9, 2016
 * @comment 
 */
public class Main {
    public static void main(String[] args) {
        Reformatory eastHelsinkiReformatory = new Reformatory();
    
        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);
    
        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
    
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(pekka);
    
        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
    
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
    
        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
    }
}