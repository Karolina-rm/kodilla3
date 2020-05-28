package com.kodilla.patterns.adapter.bookclasifier;

import com.kodilla.patterns.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns.adapter.bookclasifier.libraryb.Book> books = new HashMap();
        for(Book book : bookSet) {
            com.kodilla.patterns.adapter.bookclasifier.libraryb.Book book1 = new com.kodilla.patterns.adapter.bookclasifier.libraryb.Book(book.getAuthor(),
                    book.getTitle(), book.getPublicationYear());
            books.put(new BookSignature(book.getSignature()), book1);
        }
        return medianPublicationYear(books);

    }
}
