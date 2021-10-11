package com.sci.week_six_OOP;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalog = new ArrayList();

    void addBook(String type, String bookName, int numberOfPages, String specificInfo) {
        if (type.equalsIgnoreCase("Novel")) {
            catalog.add(new Novel(bookName, numberOfPages, specificInfo));
        } else if (type.equalsIgnoreCase("art album")) {
            catalog.add(new ArtAlbums(bookName, numberOfPages, specificInfo));
        } else {
            System.err.println("Unknown book type");
        }
    }

    void listBooks() {
        for (Book c : catalog) {
            System.out.println(c.toString());
        }
    }

    void deletebook(String bookName) {
        for (Book c : catalog) {
            if (c.getBookName().equalsIgnoreCase(bookName)) {
                System.out.println("Removing the book named '" + c.getBookName() +
                        "' witch is situated at number " + catalog.indexOf(c) + " in our catalog");
                catalog.remove(c);
            }
        }
    }
}
