import java.util.*;
import java.lang.*;
public class Array2d{
    public static void main(String [] args){
        double [][] array2= new double[3][3];
        for(int i =0;i<array2.length;i++){
            for (int j=0; j<array2.length;j++){
                array2[i][j]= (Math.random()*100);
            }
        }
    for(int a=0; a<array2.length;a++){
        for(int b=0;b<array2.length;b++){
            System.out.println(array2[a][b]);
        }
    }

    }
}