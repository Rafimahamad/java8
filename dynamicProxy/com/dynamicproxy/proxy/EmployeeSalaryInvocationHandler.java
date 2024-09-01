package com.dynamicproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.dynamicproxy.dto.IEmployee;
import com.dynamicproxy.dto.ITEmployee;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {

	private static IEmployee employee;
	
	
	
	public EmployeeSalaryInvocationHandler(IEmployee employee) {
		super();
		this.employee = employee;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		pre-processing
	
		if( method.getName().equals("giveHike")) {
		Double hikeAmount =(Double)args[0];
		if(hikeAmount<=0) throw new RuntimeException("Invalid amount ");
		}
//		making actual call to my service layer
		Object invokedmethod = method.invoke(employee, args);
//		post processing
		System.out.println("executing method : "+method.getName()+" for employeeId "+employee.getId()+" name : "+employee.getName());
		return invokedmethod;
	}


	
   public static IEmployee createProxy(ITEmployee itEmployee) {
		EmployeeSalaryInvocationHandler invocationHandler = new EmployeeSalaryInvocationHandler(itEmployee);
		IEmployee emp=(IEmployee)Proxy.newProxyInstance(
				ITEmployee.class.getClassLoader(), 
				new Class[] {IEmployee.class}, 
				invocationHandler);
		return emp;
	}
	
	
}
