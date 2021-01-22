package com.tts.bookroom;
import java.util.ArrayList;

public class Library {
    String address;
    ArrayList<Book> list;



    public Library(String library) {
        address = library;
        list = new ArrayList<Book>();
    }
    public void addBook(Book book) {
        this.list.add(book);
    }
    public static void printOpeningHours() {
        System.out.println("Both libraries are open daily from 9am to 5pm.");
    }
    public void printAddress() {
        System.out.println(this.address);
    }
    public static void printContactInfo() {

        System.out.println("First Library Location:"+"918-275-0000"+"\n"+"Second Library Location:"+"917-275-0001"+"\n");
    }
    public void borrowBook(String title) {
        for (Book book : this.list) {
            if (title.equals(book.getTitle())) {
                if (book.isRented()) {
                    System.out.println("I am terribly sorry patron, this book has already been checked out by another patron."+"\n"+
                            "Please come back to see if it has been checked back in another two weeks.Thank you for your patience.");
                } else {
                    book.rented();
                    System.out.println("Thank you patron for checking out:" + book.getTitle());
                }
                return;
            }
        }
        System.out.println("I'm sorry, we do not have this title in our catalog.");
    }
    public void printAvailableBooks() {
        if (this.list.isEmpty()) {
            System.out.println("There are no books in this catalog."+"\n"+"You see nothing here");
        }
        for (Book book : this.list) {
            System.out.println(book.getTitle());
        }
    }

    public void returnBook(String title) {
        for (Book book : this.list) {
            if (title.equals(book.getTitle())) {
                book.returned();
                System.out.println("You successfully returned " + book.getTitle());
            }
        }
    }
}


