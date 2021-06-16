package com.assignments.day3assignment;

public class Alphabet {
	static char[] charAray() {
		char[] alpha = new char[26];
				for(int i = 0; i < 26; i++){
				    alpha[i] = (char)(97 + i);
				}
		return alpha;
		
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Write a method to return an array of characters that represent that letters from a to z.
		//You can name the method getAlphabetArray.
		
       // System.out.println(charAray());
        char[] arr= charAray();
        
        for(char ele:arr) {
        	System.out.print(ele+" ");
        }
	}

}







/*
 package com.day03assignment.java;

public class Pi {
	static double getPi() {
		return Math.PI;
	}
	public static void main(String[] args) {
		System.out.println(Math.PI);
	}

}
 */