package com.dynamicproxy.dto;

public interface IEmployee {

	void giveHike(Double amount);
	void payCut(Double amount);
	
	public Integer getId();
	public void setId(Integer id);
	public String getName();
	public void setName(String name);
	void setSalary(Double salary);
	public Double getSalary();
}
