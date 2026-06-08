package com.indivaragroup.jdt17.spring.dasar.challenge.service;

import com.indivaragroup.jdt17.spring.dasar.challenge.model.impl.Book;
import com.indivaragroup.jdt17.spring.dasar.challenge.model.impl.Student;
import com.indivaragroup.jdt17.spring.dasar.challenge.repository.BookRepository;
import com.indivaragroup.jdt17.spring.dasar.challenge.repository.StudentRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addStudent(int id, String name) {
        Book book = new Book( name);
        bookRepository.add(book);
        System.out.println("===== Added Book =====");
    }

    public void findBook(String name) {
        System.out.printf("===== Find Book by Name %d =====\n", id);
        if (bookRepository.findBookName(name).isPresent()) {
            System.out.println(bookRepository.findBookName(name).get());
        } else {
            System.out.println("Book not found");
        }
    }

    public void getAllStudents() {
        System.out.println("===== Book List =====");

    }
}
