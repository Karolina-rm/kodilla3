package com.kodilla.patterns.adapter.bookclassifier;

import com.kodilla.patterns.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns.adapter.bookclasifier.libraryb.BookSignature;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Adam Mickiewicz", "Pan Tadeusz", 2000, "293748"));
        bookSet.add(new Book("Adam Mickiewicz", "Dziady", 1993, "830776"));
        bookSet.add(new Book("Adam Mickiewicz", "Reduta Ordona", 2012, "223645"));
        //When
        int publication = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2000, publication);



    }
}
