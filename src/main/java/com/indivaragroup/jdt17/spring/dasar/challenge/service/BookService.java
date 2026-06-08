package com.indivaragroup.jdt17.spring.dasar.challenge.service;

import com.indivaragroup.jdt17.spring.dasar.challenge.model.impl.Book;
import com.indivaragroup.jdt17.spring.dasar.challenge.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void addBook(String name) {
        Book book = new Book( name);
        bookRepository.add(book);
        System.out.println("===== Added Book =====");
        System.out.println(book.getName());
    }

    public void findBook(String name) {
        System.out.printf("===== Find Book by Name %s =====\n", name);
        if (bookRepository.findBookName(name).isPresent()) {
            System.out.println(bookRepository.findBookName(name).get().getName());
        } else {
            System.out.println("Book not found");
        }
    }

    public void getAllBooks() {
        System.out.println("===== Book List =====");

        for (int i = 0; i < bookRepository.getBookList().size(); i++) {
            System.out.printf("%d. %s\n", i + 1, bookRepository.getBookList().get(i).getName());
        }
    }
}
