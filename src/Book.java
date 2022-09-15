public class Book {

    private String title;

    private String author;

    private int year;

    private String edition;

    private Boolean available;

    public Book(String title, String author, int year, String edition) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.available = true;
    }
    public String getTitle(){
        return title;
    }

    public void returnBook() {

    }
    public void loan() {

    }
    public String toString() {
        return "Name: " + this.title + "Writer: " + this.author + "Year: " + this.year +
                "Edition: " + this.edition;

    }


}
