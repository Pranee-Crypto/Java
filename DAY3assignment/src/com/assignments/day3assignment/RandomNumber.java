package com.assignments.day3assignment;

public class RandomNumber {
         
	public static int randomNumber() {
        int minNum = 1;
        int maxNum = 50;;
        double d = Math.random()*(maxNum-minNum);
        return (int)d;
    }
 
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        System.out.println("The random number between 1 and 50 is "+randomNumber());
	}

}
