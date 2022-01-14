package entity;

import java.time.LocalDate;

public class Newpapers extends Document{
    private String publishDate;

    public Newpapers(String documentCode, String publisherName, String publishString, String publishDate) {
        super(documentCode, publisherName, publishString);
        this.publishDate = publishDate;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Newpapers{" +
                super.toString() +
                "publishDate='" + publishDate + '\'' +
                '}';
    }
}
