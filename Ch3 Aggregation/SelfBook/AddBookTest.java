import org.junit.Test;
import static org.junit.Assert.*;
import self.model.Book;
import self.model.BookCatalog;

public class AddBookTest {

    @Test
    public void addSuccessOneBookToFreeSpace() {
        Book b1 = new Book(123456789, "Web Programming", "programming", true);
        BookCatalog bc = new BookCatalog(2);
        int expected = 0;
        int actual = bc.addBook(b1);
        assertEquals(expected, actual);
    }

    @Test
    public void addFailOneBookNoSpace() {
        Book b1 = new Book(123456789, "Web Programming", "programming", true);
        Book b2 = new Book(120056110, "Database Management", "database", true);

        BookCatalog bc = new BookCatalog(1);
        bc.addBook(b1);

        int expected = -1;
        int actual = bc.addBook(b1);
        assertEquals(expected, actual);
    }

}
