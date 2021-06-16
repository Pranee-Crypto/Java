package com.revature.tutorial;

public class SalariedEmployee extends Employee implements Taxes {
   private double salary;

public SalariedEmployee(int id, String name, String dept, double salary) {
	super(id, name, dept);
	this.salary = salary;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return super.toString()+"SalariedEmployee [salary=" + salary + "]";
}

@Override
public String getAllowances() {
	// TODO Auto-generated method stub
	return "HEALTH, TRAVEL, FOOD";
}

@Override
public String PayTaxes() {
	// TODO Auto-generated method stub
	return "You have to pay Taxes";
}
   
}
