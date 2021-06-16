import java.util.*;
public class Vararg{
    static int addition(int ...x){
        int res=0;
        for(int i=0;i<x.length;i++){
            res=res+x[i];
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(addition(4,5,6,7));
        System.out.println(addition(1,2));
        System.out.println(addition(1,2,3));
        
    } 
}
