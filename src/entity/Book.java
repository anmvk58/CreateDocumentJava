package entity;

public class Book extends Document{
    private String author;
    private int pages;

    public Book(String documentCode, String publisherName, String publishString, String author, int pages) {
        super(documentCode, publisherName, publishString);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                super.toString() +
                "author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
