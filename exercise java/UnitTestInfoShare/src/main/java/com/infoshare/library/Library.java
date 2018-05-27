package com.infoshare.library;

import java.util.List;
import java.util.Objects;

public class Library {

        private List<Book> bookRepository;

    public Library(List<Book> bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void lendBook() {

    }

    public boolean isBookAvailable(Book book) {

        for (Book bookInRepository: bookRepository) {

            if(Objects.equals(bookInRepository.getAuthor(), book.getTitle())){
                return true;
            }

        }

        return false;
    }
}
