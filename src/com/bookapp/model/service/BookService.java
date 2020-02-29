package com.bookapp.model.service;
import com.bookapp.model.persistance.Book;
import java.util.*;
public interface BookService {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public void deleteBook(int id);
	public void updateBook(int id, Book book);
	public Book getBookById(int id);
}
