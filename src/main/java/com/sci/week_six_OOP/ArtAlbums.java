package com.sci.week_six_OOP;

public class ArtAlbums extends Book {

    private int paperQuality;

    ArtAlbums(String bookName, int numberOfPages, String paperQuality) {

        super(bookName, numberOfPages);
        this.paperQuality = Integer.parseInt(paperQuality);

    }

    @Override
    public String toString() {
        return super.toString() + " Art Album{ " +
                "paper quality= " + paperQuality +
                "}";
    }
}
