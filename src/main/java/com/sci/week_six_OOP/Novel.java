package com.sci.week_six_OOP;

public class Novel extends Book {

    private String novelType;

    Novel(String bookName, int numberOfPages, String novelType) {

        super(bookName, numberOfPages);
        this.novelType = novelType;

    }

    @Override
    public String toString() {
        return super.toString() + " Novel{ " +
                "novel type= " + novelType +
                "}";
    }

}
