// Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a
// default constructor and two parameterized constructors:

class Book {

    String title;
    String author;
    int price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

}

public class program2 {

    public static void main(String[] args) {
        Book b1 = new Book("Novel","james");
        Book b2 = new Book("Drama","homes",1600);
        System.out.println(b1.title + b1.author + b1.price);
        System.out.println(b2.title + b2.author + b2.price);
    }
}
