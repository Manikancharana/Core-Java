package Programming.Methods;
 import java.util.*;
public class Prime {
    
        // static boolean isprime(int n){
        //     int fc= 0;
        //     for(int i=2;i<(int)Math.sqrt(n);i++){   // Math is class 
        //         if(n%i==0){
        //             fc++;
        //         }
        //     }
        //     return fc==0;
        // }
        
         static boolean isprime(int n){
             if(n<=1)
                return false;
            for(int i=2;i<=(int)Math.sqrt(n);i++){   // Math is class 
                if(n%i==0){
                 return false;
                }
            }
            return true;
        }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(isprime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }
}
}
