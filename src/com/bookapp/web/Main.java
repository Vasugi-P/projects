package com.bookapp.web;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.service.BookService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("books.xml");
		BookService bookService=(BookService) ctx.getBean("bookService");
		
		List<Book> books=bookService.getAllBooks();
	for(Book book:books){
		System.out.println(book);
	}
		
	}
}
