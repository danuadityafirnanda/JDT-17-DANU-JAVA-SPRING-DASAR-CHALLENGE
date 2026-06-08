package com.indivaragroup.jdt17.spring.dasar.challenge.repository;

import com.indivaragroup.jdt17.spring.dasar.challenge.model.impl.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {
    private List<Book> bookList = new ArrayList<>();

    public void add(Book book) {
        bookList.add(book);
    }

    public Optional<Book> findBookName(String name) {
        return bookList.stream()
                .filter(book -> book.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
