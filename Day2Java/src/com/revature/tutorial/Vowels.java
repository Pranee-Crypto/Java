package com.revature.tutorial;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		String str1= obj.nextLine();
		str1= str1.toLowerCase();
		 int count=0;
		for(int i=0;i<str1.length();i++) {
			if( str1.charAt(i)=='a' ||
					str1.charAt(i)=='e' || 
					str1.charAt(i)=='i' || 
					str1.charAt(i)=='o' || 
					str1.charAt(i)=='u') {
				count++;
			}
		}
			
		
		// TODO Auto-generated method stub
		System.out.println("The total numbers of vowels in the entered string are "+count);

	}

}
