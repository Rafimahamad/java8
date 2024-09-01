package com.dynamicproxy.dto;

public class ITEmployee implements IEmployee{

	private Integer id;
	private String name;
	private Double salary;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	
	@Override
	public void giveHike(Double amount) {
		this.salary=this.salary+amount;
	System.out.println(this.salary);	
	}

	@Override
	public void payCut(Double amount) {
		this.salary=this.salary-amount;
		System.out.println(this.salary);	
	}

	public ITEmployee() {
		
	}

	
}
