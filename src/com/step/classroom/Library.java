package com.step.classroom;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    private Set<Book> books;
    private Set<Reader> readers;
    private Map<Book, Reasons> removedBooks;

    public Library() {
        this.books = new HashSet<>();
        this.readers = new HashSet<>();
        this.removedBooks = new HashMap<>();
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

    public boolean removeBook(Book book, Reasons reason) {
        this.removedBooks.put(book, reason);
        return this.books.remove(book);
    }

    public void printRemoved() {
        for (Map.Entry<Book, Reasons> entry : removedBooks.entrySet()) {
            System.out.printf("%s - %s", entry.getKey().getName(), entry.getValue().getExplanation());
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", readers=" + readers +
                '}';
    }
}
