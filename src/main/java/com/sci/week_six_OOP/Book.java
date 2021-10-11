package com.sci.week_six_OOP;

public class Book {
    private String bookName;
    private int numberOfPages;


    Book(String bookName, int numberOfPages) {

        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
    }

    String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return
                "Book {" +
                "book name= '" + bookName +
                "', number of pages= " + numberOfPages +
                "};";
    }

}
