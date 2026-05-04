package Programming.Methods;

import java.util.*;

public class PrimeRange {

//     static void isprime(int n, int n2){
//             int fc= 0;
//             if(n>1){
//             for(int i=n;i<(int)Math.sqrt(n2);i++){   // Math is class 
//                 if(n%i==0){
//                     fc++;
//                 }
//                 if(fc==0){
//                     System.out.print(i);
//                 }
//             }
//         }
//             else{
//                 System.out.print("No number ");
//             }
//         }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         int n2 = sc.nextInt();
//         isprime(n,n2);

// }



public static boolean isprime(int n){
    int fc=0;
    for(int i=2;i<=Math.sqrt(n);i++){
       if(n%i==0){
        fc++;
       }
    }
    if(fc==0 && n>1){
   return true;
    }
    else {
        return false;
    }
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum=0,sum1=0, c=0,alt=0;
    int n1=sc.nextInt();
    int n2= sc.nextInt();

    for(int i=n1;i<=n2;i++){
        if(isprime(i)){
            // System.out.print(i + " ");
            c++;
            // sum+=i;  // To cal Sum of prime numbers
            if(c%2==1){
                // System.out.print(i +" ");  // To print alternate numbers 
                   sum1+=i;  //TO print Alternate prime numbers
                alt++;
            }
        }
    }
    // System.out.print("Prime Sum is " + sum);
    // System.out.print("Prime Count is "+c);
    // System.out.printf("%.3f",(float)sum/c);  // Average of prime numbers
    // System.out.print("Alternate prime Sum is " + sum1); // To print Alternate prime numbers
    System.out.printf("%.3f",(float)sum1/alt);

}
}
