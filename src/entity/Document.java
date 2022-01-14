package entity;

public class Document {
    private String documentCode;
    private String publisherName;
    private String publishString;

    public Document(String documentCode, String publisherName, String publishString) {
        this.documentCode = documentCode;
        this.publisherName = publisherName;
        this.publishString = publishString;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublishString() {
        return publishString;
    }

    public void setPublishString(String publishString) {
        this.publishString = publishString;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentCode='" + documentCode + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", publishString='" + publishString + '\'' +
                '}';
    }
}
