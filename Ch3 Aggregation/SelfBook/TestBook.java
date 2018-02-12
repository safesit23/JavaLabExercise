package self.model;
public class TestBook {
    public static void main(String[] args) {
        BookCatalog bc = new BookCatalog(2);
        Book b1 = new Book(123456789, "Web Programming", "programming", true);
        
        System.out.println(bc.addBook(b1));
        for(int i=0;i<bc.getBooks().length;i++){
           System.out.println(bc.getBooks()[i]);
        }
        
        
    }
}
