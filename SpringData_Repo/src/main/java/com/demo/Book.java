package com.demo;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="boo")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	private String title;
	private LocalDate publishDate;
	private int pageCount;
	private double price;
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String title, LocalDate publishDate, int pageCount, double price) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.pageCount = pageCount;
		this.price = price;
	}
	
	public Book(Long bookId, String title, LocalDate publishDate, int pageCount, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.publishDate = publishDate;
		this.pageCount = pageCount;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", publishDate=" + publishDate + ", pageCount="
				+ pageCount + ", price=" + price + "]";
	}


}
