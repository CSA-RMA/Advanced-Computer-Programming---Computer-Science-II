import java.util.Calendar;
public class Person {
    private String name;
    private MyDate birthday;
    MyDate today=new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.YEAR));

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    public Person(String name, MyDate date) {
        this.name=name;
        this.birthday=date;
    }
    public Person(String name) {
        this.name=name;
        birthday=today;
    }
    public int age() {
        return birthday.differenceInYears(today);
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return this.name +", born "+ this.birthday;
    }
    public boolean olderThan(Person pekka) {
        return pekka.age()>this.age();
    }
}