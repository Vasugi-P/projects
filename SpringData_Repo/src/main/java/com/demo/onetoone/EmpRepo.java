package com.demo.onetoone;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Long>{
	
	@Query("from Emp e join fetch e.parking Parking")
	public List<Emp>empWithParking();
	

	@Query("select e.name from Emp e")
	public List<Emp>empsName();

	

}
