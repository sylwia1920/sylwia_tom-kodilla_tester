package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        List<Book> bookList = new ArrayList<>();
        bookList.add(bookManager.createBook("Wiedzmin", "Andrzej Sapkowski"));
        bookList.add(bookManager.createBook("Harry Potter", "J.K. Rowling"));

        System.out.println(bookList.get(0).equals(bookList.get(1)));
        System.out.println(bookList.get(0) == bookList.get(1));

        //System.out.println(book.equals(book1));
        //System.out.println(book == book1);

        Set<Book> books = bookManager.getBooks();

        for (Book book : books){
            System.out.println(book);
        }
    }
    }
