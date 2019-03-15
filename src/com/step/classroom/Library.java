package com.step.classroom;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Library {
    private Set<Book> books;
    private Set<Reader> readers;

    public Library() {
        this.books = new HashSet<>();
        this.readers = new HashSet<>();
    }

    public boolean addReader(Reader reader) {
        return this.readers.add(reader);
    }

    public boolean addBook(Book book) {
        return this.books.add(book);
    }

    public Set<Book> getBooks() {
        return Collections.unmodifiableSet(books);
    }

    public Set<Reader> getReaders() {
        return Collections.unmodifiableSet(readers);
    }

    public boolean lendBook() {
        Reader reader = readers.iterator().next();
        Book book = books.iterator().next();
        reader.borrowBook(book);
        return false;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", readers=" + readers +
                '}';
    }
}
