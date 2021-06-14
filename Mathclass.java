import java.util.*;
import java.lang.*;
class Mathclass{
  public  int add(int a , int b){
       return a+b;
}
public int subtract(int a , int b){
 return a-b;
}
public int multiply(int a , int b){
return a*b;
}
public int divide(int a, int b){
return a/b ;
}}
public class Mainclass{
    public static void main(String[] args){
        Mathclass obj1= new Mathclass();
        System.out.println("The addition of 10 and 5 is"+obj1.add(10,5));
        System.out.println("The difference of 10 and 5 is"+obj1.subtract(10,5));
        System.out.println("The product  of 10 and 5 is"+obj1.multiply(10,5));
        System.out.println("The division of 10 and 5 is"+obj1.divide(10,5));
    }
}

