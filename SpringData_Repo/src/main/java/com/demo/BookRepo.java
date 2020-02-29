package com.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long>{
	public List<Book>findByTitle(String title);
	public List<Book> findByTitleLike(String title);

	public List<Book> findByTitleContaining(String title);
	
	public List<Book> findByPageCountBetween(int min, int max);
	public List<Book> findByTitleContainingAndPageCountGreaterThan(String title, int pageCount);
}
