package com.revature.customers;

public class Customer {
	private String name;
	private int id;
	private String location;
	private final String  COMPANY="revature";
	static String details="The details of the customers are: ";
	
    public Customer() {
    	 }
    public Customer(String customerName) {
    	/*name=customerName;*/
    	System.out.println("Welcome"+ customerName);
    	System.out.println("You are in "+COMPANY);
    	}
    public void Info(int empid,String custName) { 
    	/*name=custName;
    	id=empid; */
    	System.out.println("Your id is "+empid+" , "+custName);
    	
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void Info(int empid, String custName, String loc) {
    	/*name= custName;
    	id=empid;
    	location = loc;*/
    	System.out.println("Your id is "+empid+" ,"+custName+" and you are from "+loc);
    	
    }

}
