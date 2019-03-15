package com.step.classroom;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test
    public void shouldAddBookToLibrary() {
        Library library = new Library();
        library.addBook(new Book("C"));
        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void shouldAddReaderToLibrary() {
        Library library = new Library();
        library.addReader(new Reader("Ram"));
        assertEquals(1, library.getReaders().size());
    }

}