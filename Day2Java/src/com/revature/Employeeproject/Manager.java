package com.revature.Employeeproject;

public class Manager {
	public static void main(String[] args) {
		Employee E1= new Employee();
		E1.setName("Praneetha");
		E1.setId(10);
		E1.setSalary(500000);
		
		System.out.println(E1.getId()+" "+E1.getName()+" "+E1.getSalary());
	}

}
