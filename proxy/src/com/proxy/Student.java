package com.proxy;

public class Student implements DailySession {

	private Attendance attendance;
	
	public Attendance getAttendance() {
		return attendance;
	}


	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}


	public Student(Attendance attendance) {
		this.attendance = attendance;
	}


	public Student() {
	
	}


	@Override
	public void attendSession() {
		System.out.println("attending the session...");
		
	}
	
	public void attendSession(Integer id) {
		System.out.println("attending the session with student_ID"+id);
		
	}


	@Override
	public String toString() {
		return "Student [attendance=" + attendance + "]";
	}
	

}
