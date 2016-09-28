public class main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 15, 2, 1993);
        Person steve = new Person("Thomas", 1, 3, 1955);
        Person martin = new Person("Martin", 1, 3, 1983);

        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
        Person john = new Person("John", new MyDate(15, 2, 1983));
        Person steven = new Person("Steven");

        System.out.println( john );
        System.out.println( steven );
    }
}
