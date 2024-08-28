// Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to
// add and remove books from a collection.

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters for book details (optional, if you want to access book details later)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

public class program4 {
    private List<Book> bookCollection;

    public program4() {
        bookCollection = new ArrayList<>();
    }

    // Method to add a book to the collection
    public void addBook(Book book) {
        bookCollection.add(book);
    }

    // Method to remove a book from the collection
    public void removeBook(Book book) {
        bookCollection.remove(book);
    }

    // Optional: Method to display the collection
    public void displayBooks() {
        for (Book book : bookCollection) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }

    public static void main(String[] args) {
        program4 library = new program4();

        // Create some books
        Book book1 = new Book("Book One", "Author One", "1234567890");
        Book book2 = new Book("Book Two", "Author Two", "0987654321");

        // Add books to the collection
        library.addBook(book1);
        library.addBook(book2);

        // Display the collection
        library.displayBooks();

        // Remove a book from the collection
        library.removeBook(book1);
        library.removeBook(book2);
        // Display the collection again to confirm removal
        System.out.println("new array list");
        library.displayBooks();
    }
}
