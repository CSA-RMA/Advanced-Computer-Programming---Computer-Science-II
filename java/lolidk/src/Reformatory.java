/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Reformatory v1
 * @date Feb 9, 2016
 * @comment 
 */
public class Reformatory {
    int weightsmeasured=0;
    public int weight(Person person) {
        // returns the weight of the parameter
        this.weightsmeasured++;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    public int totalWeightsMeasured() {
        return weightsmeasured;
    }
}