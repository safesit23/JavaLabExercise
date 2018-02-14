package self.model;
public class TestBook {
    public static void main(String[] args) {
        BookCatalog bc = new BookCatalog(2);
        Book b1 = new Book(123456789, "Web Programming", "programming", true);
        System.out.println("Index that add book: "+bc.addBook(b1));
        System.out.println("NumOfBook: "+bc.getNumOfBooks());
        
        //Test Equal Method
        if(b1.equals("hghghghg")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        System.out.println("PRINT BOOK");
        for(int i=0;i<bc.getBooks().length;i++){
           System.out.println(bc.getBooks()[i]);
        }
        
        
    }
}
