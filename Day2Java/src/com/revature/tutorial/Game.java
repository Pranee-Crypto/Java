package com.revature.tutorial;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
       boolean val=true;
       while(val) {
    	   char ch=sc.next().charAt(0);
    	   switch(ch) {
			case '1':
				System.out.println("Moving Right");
				break;
			
			case '2':
				System.out.println("Moving left");
				break;
				
			case '3':
				System.out.println("Moving up");
				break;
			case '4':
				System.out.println("Moving down");
				break;
			case 'q':
				val = false;
				break;
			default:
				System.out.println("Try again. Acceptable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
			
			
			
		}

    	   
    	   
    	   
	}
       }}


