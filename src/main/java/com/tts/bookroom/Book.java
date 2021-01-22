package com.tts.bookroom;

public class Book {

    String title;
    boolean rented;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
    }



    // Marks the book as rented
    public void rented() {
        this.rented = true;
    }

    // Marks the book as not rented
    public void returned() {
        this.rented = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isRented() {
        if (this.rented){
            return true;
        } else{
            return false;
        }
    }

    // Returns the title of the book
    public String getTitle() {
        return this.title;
    }

    public static void main(String[] arguments) {
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