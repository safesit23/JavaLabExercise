package self.model;

public class Book {

    private long isbn;
    private String title;
    private String category;
    private boolean available;

    public Book(long isbn, String title, String category, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean equals(Object obj) {
        Book temp = null;
        if (obj != null && obj instanceof Book) {
            temp = (Book) obj;
            if (isbn == temp.isbn) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", category=" + category + ", available=" + available + '}';
    }

}
