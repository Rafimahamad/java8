package com.proxy;
import java.util.Date;

public class Attendance {
private Date date;
private boolean isPresent;



public Attendance(Date date, boolean isPresent) {
	super();
	this.date = date;
	this.isPresent = isPresent;
}
public boolean isPresent() {
	return isPresent;
}
public void setPresent(boolean isPresent) {
	this.isPresent = isPresent;
}


}
