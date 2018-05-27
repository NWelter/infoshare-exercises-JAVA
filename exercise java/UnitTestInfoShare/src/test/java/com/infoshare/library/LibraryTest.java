package com.infoshare.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    private List<Book> books;

    @Before

    public void setupLibrary() {
        books = new ArrayList<>();
        books.add(new Book("Lem, Stanisław", "Solaris", 1));
        books.add(new Book("Lem, Stanisław", "Bajki robotów", 2));

    }

    @Test

    public void shouldReturnFalseIfBookNotAvailable() {

        //given:

        Library library = new Library(books);
        Book testBook = new Book("Lem", "Eden", 3);

        //when:
        boolean isAvailable = library.isBookAvailable(testBook);

        //then:

        Assert.assertFalse(isAvailable);


    }

    @Test

    public void shouldReturnTrueIfBookAvailable() {

        //given:

        Library library = new Library(books);
        Book testBook = new Book("Lem, Stanisław", "Bajki robotów", 2);

        //when:
        boolean isAvailable = library.isBookAvailable(testBook);

        //then:

        Assert.assertTrue(isAvailable);

    }


}
