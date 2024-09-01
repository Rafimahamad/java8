package com.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Reflection
public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, 
	NoSuchMethodException, SecurityException, 
	InstantiationException, IllegalAccessException, 
	InvocationTargetException {

Class<?> studentInfo = Class.forName("com.proxy.Student");
Constructor<?>[] constructor = studentInfo.getConstructors();
System.out.println("constructors ....");
for(Constructor constr:constructor) {
	System.out.println(constr);
}

Method[] declaredMethods = studentInfo.getDeclaredMethods();
System.out.println("Methods ....");
for(Method methods:declaredMethods) {
	System.out.println(methods);
}


Object student = studentInfo.newInstance();

 Class[] methodArgsType= new Class[] {Integer.class};
Method method = studentInfo.getMethod("attendSession",methodArgsType);
method.invoke(student, 82);

Method method2 = studentInfo.getMethod("attendSession");

method2.invoke(student);

//Class<Student> student = Student.class;
//
//	Constructor<?>[] constructors = student.getConstructors();
//	Method[] methods = student.getMethods();
//	Method[] declaredMethods2 = student.getDeclaredMethods();
//	System.out.println("loading student class.......");
//	System.out.println("constructors : "+constructors);
//	System.out.println("methods "+methods);
//	System.out.println("declaredMethods2 "+declaredMethods2);

	}
}
