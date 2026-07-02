package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class App {
    public static void main(String[] args) {
        // Load the context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve the bean
        BookService service = (BookService) context.getBean("bookService");
        
        // Test the configuration
        service.execute();
    }
}