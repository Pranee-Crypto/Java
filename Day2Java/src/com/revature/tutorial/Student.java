package com.revature.tutorial;

public class Student {
  int rollNo;
  String name;
  void input(int rno, String name1) {
	  rollNo=rno;
	  name =name1 ;
  }
  void display() {
	  System.out.println("Roll NO "+ rollNo+"Name "+name);
  }
}
