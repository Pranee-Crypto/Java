package com.revature.tutorial;

public class Factorial {
	private  int  factorial(int num){
		int fact=1;
		for(int j=1;j<=num;j++) {
		
		 fact=fact*j;
		 
		 }
		return fact;
	}
	public static void main(String[] args) {
		Factorial factorial1= new Factorial();
		System.out.println("The factorial of the number 5 is "+factorial1.factorial(5));
	}

}
