import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Library library = new Library (); // Detta är biblioteket med en lista av Book objekt.


    public static void main(String[] args) {

        Boolean isRunning = true;



        Book b1 = new Book("The Fellowship of the Rings ", " J.R.R. Tolkien ",1954, " First edition ");
        Book b2 = new Book("Frippes Incredible Journey ", " I.A.F.Nilsson ",  1996, " First edition ");
        Book b3 = new Book("Rune - The Mind Of A Killer ", " I.A.F.Nilsson ",  2022, " First edition ");
        Book b4 = new Book("Eat Some Chippies With The Dippies ", " I.A.F.Nilsson ",  2015, " First edition ");

        library.availableBooks.add(b1);
        library.availableBooks.add(b2);
        library.availableBooks.add(b3);
        library.availableBooks.add(b4);



            while (isRunning){
                System.out.println("Welcome to the library! What do you want?");
                System.out.println("============");
                System.out.println("1. Add a book to the library");
                System.out.println("2. Search for a book by name");
                System.out.println("3. List all available books");
                System.out.println("4. Loan a book");
                System.out.println("5. Return a book");
                System.out.println("6. Quit");
                System.out.println("============");

                Scanner sc = new Scanner(System.in);
                int answer = sc.nextInt();

                switch(answer){
                    case 1:
                        addBook();
                        break;
                    case 2:
                        searchBookByName();
                        break;
                    case 3:
                        showAllAvailableBooks();
                        break;
                    case 4:
                        //  loanBook();
                        break;
                    case 5:
                        //  returnBook();
                        break;

                    case 6:
                        //  goodBye();
                        break;
                    default:
                        System.out.println("Error");
                        break;

                }

            }



    }

    public static void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add a book to the library: ");
        System.out.println("Enter title: ");
        String title = sc.nextLine();
        System.out.println("Author: ");
        String author = sc.nextLine();
        System.out.println("Year: ");
        int year = sc.nextInt();
        System.out.println("Edition: ");
        String edition = sc.nextLine();


        Book book = new Book(title, author, year, edition);
        library.availableBooks.add(book);
        System.out.println("You added " + title + " by "  + author + " from " + year + " edition " + edition + " to the library. ");

     sc.nextLine();
    }

    public static void showAllAvailableBooks(){
        for (Book book : library.availableBooks ) {
            System.out.println(book.getTitle());
}


    }


    public static void searchBookByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which book are you looking for?");
        String search = sc.nextLine();//den bok som använderen söker efter

        boolean exists = false;

        ArrayList<String> matches = new ArrayList<String>(); // skapar en lista av strängar för att lägga eventuella matchningar

        for (Book book : library.availableBooks ) { //Loopar igenom alla Book object i library.availableBooks och kollar om det är = search
           String title = book.getTitle();
           if (title.contains(search)) {     //kollar om title innehåller search
               matches.add(title);      //om det ovanför stämmer, gå in i if statsen och lägg till title i matches
           }

        }

        if (matches.size() > 0) {     // om matches.size är större än 0 betyder det att det fanns matchningar på search
            for (String title:matches)  {
                System.out.println(title + " is available ");
}
        } else {
            System.out.println(search + " gave no results");
        }
        



        sc.nextLine();








    }
         /*for (Book book : bookList) {
         if (Book.getTitle().equals(bookList))  {
             System.out.println("Boken finns inne!");
             else if ( )  {
                 System.out.println("Boken finns tyvärr inte hos oss");
             }


          */

    //public void showAvailableBooks(); {

       // for (Book book : book) {
                   // System.out.println(book.name);


         }






