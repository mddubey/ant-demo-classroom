package com.step.classroom;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Reader {
    private String name;
    private Set<Book> books;

    public String getName() {
        return name;
    }

    public Reader(String name) {
        this.name = name;
        this.books = new HashSet<>();
    }

    public void borrowBook(Book book) {
        this.books.add(book);
    }

    public void returnBook(Book book) {
        this.books.remove(book);
    }

    public Set<Book> getBooks() {
        return Collections.unmodifiableSet(books);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
