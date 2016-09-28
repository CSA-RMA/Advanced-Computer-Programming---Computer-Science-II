public class Book {
    String title;
    String publisher;
    int year;
    public Book(String title, String publisher, int year) {
        this.title=title;
        this.publisher=publisher;
        this.year=year;
    }
    public String title() {
        return title;
    }
    public String publisher() {
        return publisher;
    }
    int year() {
        return year;
    }
    public String toString() {
        return String.format("%s, %s, %s",title,publisher,year);
    }
}
