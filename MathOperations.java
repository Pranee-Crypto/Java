import java.util.*;
import java.lang.*;
public class MathOperations{
  public static int add(int a , int b){
       return a+b;
}
public static int subtract(int a , int b){
 return a-b;
}
public static int multiply(int a , int b){
return a*b;
}
public static int divide(int a, int b){
return a/b ;
}
 public static void main(String[] args){

     System.out.println("The sum of two numbers is "+add(3,4));
     System.out.println("The difference of two numbers is "+subtract(11,7));
     System.out.println("The product of two numbers is "+multiply(3,4));
     System.out.println("The division of two numbers is "+divide(50,10));

     

}
}