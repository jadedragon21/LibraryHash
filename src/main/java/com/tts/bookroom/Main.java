package com.tts.bookroom;
import static com.tts.bookroom.Library.printOpeningHours;
import static com.tts.bookroom.Library.printContactInfo;

public class Main {

    public static void main(String[] args) {


        // Create two libraries
        Library firstLibrary = new Library("First Library Location:"+"10 Main St.");
        Library secondLibrary = new Library("Second Library Location:"+"228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        firstLibrary.addBook(new Book("The Two Towers"));
        firstLibrary.addBook(new Book("The Hobbit"));
        firstLibrary.addBook(new Book("Dune"));
        firstLibrary.addBook(new Book("Dragonriders of Pern"));

        //Add four books to the second library

        secondLibrary.addBook(new Book("Effective Code"));
        secondLibrary.addBook(new Book("Java for Dummies"));
        secondLibrary.addBook(new Book("Java in one day and LEARN IT WELL"));
        secondLibrary.addBook(new Book("Learn Java 12 Programming"));
        secondLibrary.addBook(new Book("Core Java Volume I – Fundamentals"));
        secondLibrary.addBook(new Book("Java: A Beginner’s Guide"));
        secondLibrary.addBook(new Book("Java - The Complete Reference"));
        secondLibrary.addBook(new Book("Head First Java"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        //Print Contact info for the Libraries
        printContactInfo();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in both libraries:");
        firstLibrary.printAvailableBooks();
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        // Print the titles of available from the second library
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();



        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isRented());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isRented());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isRented());


    }
}