package com.bookapp.model.persistance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Primary
@Repository

public class BookDaoImplementationUsingjdbc implements BookDao{
	
	
	private DataSource dataSource;
	
	@Autowired
	public BookDaoImplementationUsingjdbc(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Book> getAllBooks() {
		Connection connection=null;
		List<Book>books=new ArrayList<Book>();
		
	 try{
		  connection=dataSource.getConnection();
		 System.out.println("conn is done");
		 Statement stmt=connection.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from book");
		 while(rs.next()){
			 books.add(new Book(rs.getInt("id"),rs.getString("isbn"),rs.getString("title"),rs.getString("author"),rs.getDouble("price")));
		 }
	 }catch(SQLException e){
		 e.printStackTrace();
	 }finally{
		 if(connection!=null){
			 try{
				 connection.close();
			 }catch(SQLException e){
				 e.printStackTrace();
			 }
		 }
	 }
		return books;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
