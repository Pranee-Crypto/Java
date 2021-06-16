package com.assignments.day3assignment;

public class SquareMain {
public static float[] Square(int a, int b, int c,int d) {
	a=1;b=2;
	c=3;
	d=4;
	float[] ar= new float[4];
	ar[0]=a*a;
	ar[1]=b*b;
	ar[2]=c*c;
	ar[3]=d*d;
	
	return ar;
}


public static void main(String[] args) {

float[] sq= new float[4];
sq= Square(1,2,3,4);
}}
