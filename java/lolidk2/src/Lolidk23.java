public class Lolidk23 {
    public static void main(String[] args) {
        Book javaDummy = new Book("Java for Dummy", 19.99, 99);
        System.out.println(javaDummy);  // toString()
        System.out.print("The authors are: ");
        javaDummy.printAuthors();
        javaDummy.addAuthor(new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'));
        javaDummy.addAuthor(new Author("Paul Tan", "Paul@nowhere.com", 'm'));
        System.out.println(javaDummy);  // toString()
        System.out.print("The authors are: ");
        javaDummy.printAuthors();
    }
}
class Author {
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender) {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return name+" ("+gender+") at "+email;
    }
    
}
class Book {
    public String name;
    private Author[] authors=new Author[5]; // why would you put a maximum on authors, its just stupid
    private int numAuthors=0;
    double price;
    int qtyInStock;
    public Book(String name, double price, int qtyInStock) {
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    public Book(String name, double price) {
        this(name, price, 0);
    }
    public String getName() {
        return name;
    }
    public void addAuthor(Author author) {
      authors[numAuthors] = author;
      numAuthors++;
    }
    public boolean removeAuthorByName(String authorName) {
        for(int i=0;i<authors.length;i+=1) {
            if(authors[i].equals(authorName)) {
                authors[i]=null;
                return true;
            }
        }
        return false;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public String getAuthorName(int authornum) {
        return authors[authornum].getName();
    }
    public String getAuthorEmail(int authornum) {
        return authors[authornum].getEmail();
    }
    public char getAuthorGender(int authornum) {
        return authors[authornum].getGender();
    }
    public void printAuthors() {
        for(int i=0;i<authors.length;i+=1) {
            System.out.println(authors[i]);
        }
    }
    public void setPrice(double price) {
        this.price=price;
    }
    public double getPrice() {
        return price;
    }
    public void setQtyInStock(int qtyinstock) {
        this.qtyInStock=qtyinstock;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public String toString() {
        return name+" by "+authors.length+" authors";
    }
}