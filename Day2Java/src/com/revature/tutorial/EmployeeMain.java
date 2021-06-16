package com.revature.tutorial;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SalariedEmployee Emp1= new SalariedEmployee(101,"Praneetha","IT",50000);
	System.out.println(Emp1);
	System.out.println(Emp1.getAllowances());
	Contractemployee Emp2= new Contractemployee(101,"Praneetha","IT",30);
	System.out.println(Emp2); 
	System.out.println(Emp2.getAllowances());
	System.out.println(Emp1.PayTaxes());
	}

}
