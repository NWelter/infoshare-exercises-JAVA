package com.infoshare.library;

public class Book {

    private String title;
    private String author;
    private int bookId;
    private boolean isBorrowed;
    private String string;


    public Book(String author, String title, int bookId) {

        this.author = author;
        this.title = title;
        this.isBorrowed = false;
        this.bookId = bookId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
