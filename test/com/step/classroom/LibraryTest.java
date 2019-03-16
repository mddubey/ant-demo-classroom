package com.step.classroom;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void shouldRemoveABookFromLibrary() {
        Library library = new Library();
        Book book = new Book("C");

        library.addBook(book);

        assertTrue(library.removeBook(book, Reasons.DAMAGED));

        library.printRemoved();
    }

    @Test
    public void shouldNotRemoveABookFromLibraryIfReasonIsInvalid() {
        Library library = new Library();
        Book book = new Book("C");

        library.addBook(book);

        assertFalse(library.removeBook(book, Reasons.DAMAGED));
    }
}