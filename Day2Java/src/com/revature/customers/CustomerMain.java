package com.revature.customers;

public class CustomerMain {
	public static void main(String [] args) {
		
		Customer c2= new Customer();
		Customer c1= new Customer("Praneetha");
		System.out.println(Customer.details);
		c1.Info(101, "Praneetha");
		c1.Info(102, "Sruthi", "Hyderabad");
	}

}
