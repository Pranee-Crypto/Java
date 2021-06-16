//write a program to create a 1D array having 10 elemets ;initialize the array in the multiples of 5, display them 
// 2.Create a 2D array of 3*3 , initialize it with random numbers and display it 

import java.util.*;
import java.lang.*;
public class Array1{
    public   static void main(String[]  args){
        int [] numbers = new int[10];
        for (int i=0;i<=9;i++){
            numbers[i]=5*i;
        }
        System.out.println("The first 10 multiples of 5 are");
        for(int element:numbers)
        {System.out.println(element);}

    }
}
