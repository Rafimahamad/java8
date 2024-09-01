package com.proxy;

public class StudentProxy extends Student{

	public StudentProxy(Attendance attendance) {
		super(attendance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attendSession() {
		if(super.getAttendance().isPresent()) {
			super.attendSession();
		}
		else throw new RuntimeException("Student is not present...");
		
		
	}
	
}
