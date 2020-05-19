package com.kodilla.collections.adv.immutable;

public class Book {
    protected String author;
    protected String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;

    }

    public final String getAuthor() { return author; }  // efekt koncowy

    public String getTitle() { return title; }


    /*public String getAuthor() {  // przed efektem koncowym
        return author;
    }

    public String getTitle() {
        return title;
    }

     */
}
