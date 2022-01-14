package entity;

public class Magazine extends Document{
    private String publishNumber;
    private String puhlishMonth;

    public Magazine(String documentCode, String publisherName, String publishString, String publishNumber, String puhlishMonth) {
        super(documentCode, publisherName, publishString);
        this.publishNumber = publishNumber;
        this.puhlishMonth = puhlishMonth;
    }

    public String getPublishNumber() {
        return publishNumber;
    }

    public void setPublishNumber(String publishNumber) {
        this.publishNumber = publishNumber;
    }

    public String getPuhlishMonth() {
        return puhlishMonth;
    }

    public void setPuhlishMonth(String puhlishMonth) {
        this.puhlishMonth = puhlishMonth;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                super.toString() +
                "publishNumber='" + publishNumber + '\'' +
                ", puhlishMonth='" + puhlishMonth + '\'' +
                '}';
    }
}
