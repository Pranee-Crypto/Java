package com.revature.tutorial;

public class Contractemployee extends Employee {
  private int hours;


public Contractemployee(int id, String name, String dept, int hours) {
	super(id, name, dept);
	this.hours = hours;
}

public int getHours() {
	return hours;
}

public void setHours(int hours) {
	this.hours = hours;
}

@Override
public String toString() {
	return super.toString()+"Contractemployee [hours=" + hours + "]";
}

@Override
public String getAllowances() {
	// TODO Auto-generated method stub
	return "Health";
}
  
}
