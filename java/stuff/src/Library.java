import java.util.ArrayList;
import static java.util.Arrays.asList;
public class Library {
    public ArrayList<Book> booklist=new ArrayList<Book>(asList());
    void addBook(Book book) {
        booklist.add(book);
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found=new ArrayList<Book>(asList());
        for(Book book : booklist) {
            if(StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found=new ArrayList<Book>(asList());
        for(Book book : booklist) {
            if(StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found=new ArrayList<Book>(asList());
        for(Book book : booklist) {
            if(book.year()==year) {
                found.add(book);
            }
        }
        return found;
    }

    public void printBooks() {
        for(Book book : booklist) {
            System.out.printf("%s\n",book);
        }
    }
}
