/*ou are developing a library management system and need to implement a Book class. The Book class should have private instance variables for the book title, Add commentMore actions
author name, and publication year. Implement appropriate getter and setter methods to ensure encapsulation. Additionally, include a private variable to track the 
availability of the book (e.g., true if available, false if borrowed), and provide a public method to borrow the book, updating its availability status.*/


public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    // setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // getter
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        }
    }
    
    public void returnBook() {
        isAvailable = true;
    }

    // method
    public void bookinfo(){
        System.out.println("Book Title: " + getTitle());
        System.out.println("Book Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
    }
}

class BookDriver{
    public static void main(String[] args) {
        Book book = new Book("It Ends With Us", "Colleen Hoover", 2016);

        book.bookinfo();
        book.borrowBook();
        System.out.println("Book Available: " + book.isAvailable());
        book.returnBook();
        System.out.println("Book Available after return: " + book.isAvailable());
    }
}