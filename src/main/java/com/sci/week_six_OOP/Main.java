package com.sci.week_six_OOP;

public class Main {

    public static void main(String[] args) {

        Library UBB = new Library();

        UBB.addBook("novel", "La tiganci", 90, "scifi");
        UBB.addBook("art album", "Picturi bisericesti", 200, "30");

        UBB.listBooks();
        UBB.deletebook("La tiganci");
        UBB.listBooks();
    }
}