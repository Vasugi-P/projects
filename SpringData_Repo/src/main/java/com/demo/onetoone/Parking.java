package com.demo.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hib_par_tab")
public class Parking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pid;
	private String loc;
	private double price;
	
	@OneToOne(mappedBy="parking")
	private Emp emp;
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public Parking(String loc, double price) {
		super();
		this.loc = loc;
		this.price = price;
	}
	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Party [pid=" + pid + ", loc=" + loc + ", price=" + price + "]";
	}
	

}
