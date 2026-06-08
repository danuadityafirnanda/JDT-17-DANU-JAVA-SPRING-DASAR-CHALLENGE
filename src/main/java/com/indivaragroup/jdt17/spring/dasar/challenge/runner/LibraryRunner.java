package com.indivaragroup.jdt17.spring.dasar.challenge.runner;

import com.indivaragroup.jdt17.spring.dasar.challenge.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LibraryRunner implements ApplicationRunner {

    private final BookService bookService;

    public void run(ApplicationArguments args) throws Exception {
        bookService.addBook("Clean Code");
        bookService.addBook("Spring In Action");
        bookService.addBook("Effective Java");

        bookService.getAllBooks();

        bookService.findBook("Spring In Action");
        bookService.findBook("Belajar Java");
    }
}
