package com.library.librarymanagement;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");
        bookService.display();


        BookRepository bookRepository = (BookRepository) context.getBean("bookRepo");
        bookRepository.display();


//        BookService bookService = (BookService) context.getBean("bookService");
//
//        bookService.addBook("Maths");
//        bookService.addBook("Physics");
//        bookService.addBook("Chemistry");
//        bookService.addBook("English");
//        bookService.addBook("Computer Science");

    }
}


















