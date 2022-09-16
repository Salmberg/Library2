import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static ArrayList<Book> availableBooks = new ArrayList<>();
    static ArrayList<Book> loanedBooks = new ArrayList<>();


    public void listAllBooks() {
        for (Book book : availableBooks) {
            System.out.println(book.getTitle());
        }
    }

    public void loanBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Which book do you want to loan? ");
        String search = sc.nextLine();

        ArrayList<Book> matches = new ArrayList<Book>();

        for (Book book : availableBooks) {
            if (book.getTitle().contains(search)) {
                matches.add(book);
            }
        }
        if (matches.size() > 0) {
            for (Book book : matches) {
                System.out.println(" Is this the right one? " + book.getTitle() + "(Y/N)");
                String yesOrNo = sc.nextLine().toUpperCase();
                if (yesOrNo.equals("Y")) {
                    System.out.println(" Have a good reedingtime with " + book.getTitle());
                    sc.nextLine();
                    book.setAvailable(false);
                    Library.loanedBooks.add(book);
                } else if (yesOrNo.equals("N")) {
                    System.out.println(" OK, have a nice day!");
                    sc.nextLine();
                }
            }

        } else {
            System.out.println(" Sorry, no such book in the library ");
            sc.nextLine();
        }

        sc.nextLine();
    }

    public void returnBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Which book do you want to return? ");
        String input = sc.nextLine();

        ArrayList<Book> loanedBooks = new ArrayList<>();

        for (Book book : availableBooks) {
            if (book.getTitle().contains(input)) {
                loanedBooks.add(book);
            }
        }
        if (loanedBooks.size() > 0) {
            for (Book book : loanedBooks) {
                System.out.println(" Are you finished with this one? ? " + book.getTitle() + " (Y/N)");
                String inputBook = sc.nextLine().toUpperCase();
                if (inputBook.equals("Y")) {
                    System.out.println(" You have now returned " + book.getTitle());
                    sc.nextLine();
                    book.setAvailable(true);
                    Library.loanedBooks.add(book);
                } else if (inputBook.equals("N")) {
                    System.out.println(" OK, have a nice day!");
                    sc.nextLine();
                }
            }

        }

    }


}