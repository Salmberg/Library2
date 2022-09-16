public class Book { //Detta är ett publikt object, du kan få denna info men inte ändra värdena då dessa är privata

    public String title;

    public String author;

    public int year;

    public String edition;

    public boolean available;

    public Book(String title, String author, int year, String edition) { //konstruktör
        this.title = title;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.available = true;
    }

    public String getTitle() { //Detta är en getter
        return title;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    public String toString() {
        return "Name: " + this.title + "Writer: " + this.author + "Year: " + this.year + "Edition: " + this.edition + "Available: " + this.available;

    }


}
