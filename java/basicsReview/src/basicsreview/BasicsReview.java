// BasicsReview v1 //
// Written by Bobby Sliverman //
// For use by Chaparral Star Academy //
// Feb 2, 2016 //
package basicsreview;
public class BasicsReview {
    public static void main(String[] args) {
        System.out.println("Hello World! ");
        Person bobert=new Person("Bobby Sliverman");
        bobert.getName();
        bobert.setName("Bob Adams");
        bobert.writeName();
    }
}
class Brain {
    Brain() {
        System.out.println("Thinking... ");
    }
}
class Person {
    Brain brain=new Brain();
    String name="";
    public Person(String name) {
        this.name=name;
    }
    void testContstructor() {
        System.out.println("Constructer running! ");
    }
    void writeName() {
        System.out.println("My name is "+name);
    }
    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name=name;
    }
}