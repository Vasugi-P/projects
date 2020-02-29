package com.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.onetoone.Emp;
import com.demo.onetoone.EmpRepo;
import com.demo.onetoone.Parking;
import com.demo.onetoone.ParkingRepo;



@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	
	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private EmpRepo empRepo;

	@Autowired
	private ParkingRepo parkRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*List<Emp>emps=empRepo.empsName();
		emps.forEach(b->System.out.println(b.getName()));
		*/
		List<Emp>emps=empRepo.empWithParking();
		emps.forEach(b->System.out.println(b.getName()+":"+b.getParking()));
		
		
		
		/*
		Emp emp =new Emp("raj","90909",800.00);
		Emp emp1 =new Emp("priya","98989",900.00);
		Emp emp2 =new Emp("livi","77777",700.00);
		
		Parking parking1= new Parking("A123",100);
		Parking parking2= new Parking("T456",900);
		Parking parking3= new Parking("O987",500);
		
		emp.setParking(parking1);
		emp1.setParking(parking2);
		emp2.setParking(parking3);
		
		parking1.setEmp(emp);
	parking2.setEmp(emp1);
		parking3.setEmp(emp2);
		 empRepo.save(emp);
		 empRepo.save(emp1);
		 empRepo.save(emp2);
		 
		 parkRepo.save(parking1);
		 parkRepo.save(parking2);
		 parkRepo.save(parking3);
		 
		 */
		
		/*//public List<Book> findByTitleContainingAndPageCountGreaterThan(String title, int pageCount);
		
		List<Book>books=bookRepo.findByTitleContainingAndPageCountGreaterThan("python", 300);
		books.stream().forEach(b->System.out.println(b.getTitle()+":"+b.getPageCount()));
		
		*/
		
		
		//public List<Book> findByPageCountBetween(int min, int max);
		
		/*List<Book>books1=bookRepo.findByPageCountBetween(350, 650);
		books1.stream().forEach(b->System.out.println(b.getTitle()+":"+b.getPageCount()));*/
		
		
		//public List<Book> findByTitleLike(String title);public List<Book> findByTitleContaining(String title);
		
		/*List<Book>books=bookRepo.findByTitleContaining("p");
		books.stream().forEach(b->System.out.println(b.getTitle()));
		System.out.println("=====================================");
		List<Book>books1=bookRepo.findByTitleLike("p");
		books1.stream().forEach(b->System.out.println(b.getTitle()));*/
		
		//get bookby id
		
		/*List<Long>ids=Arrays.asList(9L,8L);
		List<Book>findAllById =bookRepo.findAllById(ids);
		findAllById.stream().forEach(b->System.out.println(b.getTitle()));*/
		
		//delete book
		
		/*List<Book>bookstodelete=Arrays.asList(new Book(12L,"chem",LocalDate.of(2015, Month.APRIL, 11),850,100));
		bookRepo.deleteAll(bookstodelete);*/
		
		//add book
		
		/*bookRepo.save(new Book("java",LocalDate.of(2010, Month.APRIL, 20),350,400));
		bookRepo.save(new Book("python",LocalDate.of(2011, Month.DECEMBER, 29),450,500));
		bookRepo.save(new Book("spring",LocalDate.of(2012, Month.JANUARY, 10),550,700));
		bookRepo.save(new Book("maths",LocalDate.of(2013, Month.MAY, 8),650,900));
		bookRepo.save(new Book("physics",LocalDate.of(2014, Month.NOVEMBER, 5),750,200));
		bookRepo.save(new Book("chem",LocalDate.of(2015, Month.APRIL, 11),850,100));
		*/
		
	}

}
