public class Control{
    public static void main(String[] args){
        int h=10;
        int a = 5;
        int b=6;
        switch(a){
            case 5:
            if(a%2==0){
            System.out.println("Given number is odd"+" "+a) ;}
            else{
                System.out.println("You have not entered 5");
            }
            break;
            case 6:
              if(b%2==0){
                  System.out.println("Given number is even"+" "+b);}
                  break;
              
              default:
                 System.out.println("You will be intimated if you have entered 5 or 6");
                   }
        System.out.println("The numbers from 1-10 are");
        while(h>0){
            if(h==5){
                h=h-1;
                continue;
                
            }
           System.out.println(h);
           h=h-1;
            }
        System.out.println("The odd numbers between 1 and 10 are:");
        for (int j=0; j<=10;j++){
            if(j%2==1){
                System.out.println(j);
            }
        }    

        }

    }
