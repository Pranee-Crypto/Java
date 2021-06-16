package com.revature.tutorial;

import java.util.StringTokenizer;

public class Stringbufferbulder {
	public static void main(String[] args) {
		String names="Praneetha :Karthikeya : Smith: Shreyaas ";
		StringTokenizer namesOfPersons=new StringTokenizer(names,":");
		while(namesOfPersons.hasMoreTokens()) {
			System.out.print(namesOfPersons.nextToken());
		}
		
		StringBuffer firstName= new StringBuffer("Praneetha");
		StringBuilder lastName = new StringBuilder("Bapatla");
		System.out.println("Welcome"+" "+firstName+" "+lastName);
		lastName.append("123");
		System.out.println(lastName);
		firstName.setCharAt(8, 'i');
		System.out.println("The name after replacing a character"+firstName);
		
		System.out.println(lastName.substring(4, 6));
		
		
	}

}
