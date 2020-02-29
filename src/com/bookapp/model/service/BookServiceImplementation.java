package com.bookapp.model.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.persistance.BookDao;
import com.bookapp.model.persistance.Book;
@Service(value="bookService")
public class BookServiceImplementation implements BookService{
	
	private BookDao bookDao;

	@Autowired
 public BookServiceImplementation(BookDao dao) {
		this.bookDao=dao;
	}
	
	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book addBook(Book book) {
		return bookDao.addBook(book);
	}

	@Override
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

	@Override
	public void updateBook(int id, Book book) {
		bookDao.updateBook(id, book);
	}

	@Override
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	public BookServiceImplementation() {
		
	}
		
}


