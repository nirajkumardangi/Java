// Create a Book class for a library system.
// • Instance variables: title, author, isbn.
// • Instance methods: borrowBook(), returnBook().
// • Static variable: totalBooks, a counter for the total number of book instances.
// • Static method: getTotalBooks(), to get the total number of books in the library.

public class Book {
    // instance variable
    String title;
    String author;
    Integer isbn;
    static int totalBooks = 0;

    // constructor
    Book(String title, String author, Integer isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    // instance method
    void borrowBook() {
        System.out.println(title + " is borrowed.");
    }

    // instance method
    void returnBook() {
        System.out.println(title + " is returned.");
    }

    // static method
    public static int getTotalBooks() {
        return totalBooks;
    }

    public void displayInfo() {
        System.out.println("--- Book Details ---");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling", 1234);
        Book b2 = new Book("Atomic Habits", "James Clear", 5678);

        b1.displayInfo();
        b2.displayInfo();

        b1.borrowBook();
        b2.borrowBook();

        System.out.println("Total books: " + Book.getTotalBooks());
    }
}

// OUTPUT:::
// --- Book Details ---
// Title: Harry Potter
// Author: J.K. Rowling
// ISBN: 1234
// --------------------
// --- Book Details ---
// Title: Atomic Habits
// Author: James Clear
// ISBN: 5678
// --------------------
// Harry Potter is borrowed.
// Atomic Habits is borrowed.
// Total books: 2

