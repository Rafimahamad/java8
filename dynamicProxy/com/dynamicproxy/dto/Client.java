package com.dynamicproxy.dto;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.dynamicproxy.proxy.EmployeeSalaryInvocationHandler;

public class Client {
public static void main(String[] args) {
	ITEmployee itEmployee = new ITEmployee();
	itEmployee.setId(412);
	itEmployee.setName("Rafi");
	itEmployee.setSalary(30000.);
//	itEmployee.giveHike(5000.);
	
//	EmployeeSalaryInvocationHandler invocationHandler = new EmployeeSalaryInvocationHandler(itEmployee);
//   IEmployee emp=(IEmployee)Proxy.newProxyInstance(
//			ITEmployee.class.getClassLoader(), 
//			new Class[] {IEmployee.class}, 
//			invocationHandler);
//   
//   emp.giveHike(5000.0);
//   
//   Double salary = emp.getSalary();
//   System.out.println(salary);
	
	
   
  IEmployee empl=EmployeeSalaryInvocationHandler.createProxy(itEmployee);
  empl.giveHike(6000.);

   
}
}
