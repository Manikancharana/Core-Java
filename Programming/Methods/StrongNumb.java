//Factorial sum equals original number

package Programming.Methods;
import java.util.Scanner;
// public class StrongNumb {
//     static void strongnum(int n){
//        int d=digit(n);
//        if(d==n){
//         System.out.println("Its a Strong number....");
//        }
//        else System.out.println("Not a Strong number.");
//     }
//     static int digit(int n){
//        int sum=0;
//         while(n>0){
//             int r=n%10;
//             n/=10;
//             sum+=fact(r);
//         }
//      return sum;
//     }
//     static int fact(int n){
//         int fac=1;
//        for(int i=1;i<=n;i++){
//          fac*=i;
//        }
//        return fac;
//     }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
//     strongnum(n);
// } 
// }

import java.util.Scanner;

public class StrongNumb {
    static boolean isStrong(int n){
        int sum=0,org=n;
        while(n>0){
            int r =n%10;
            n/=10;
            sum+=fact(r);
        }
        return sum==org;
    }
    static int fact(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(isStrong(n)){
            System.out.println("Strong number...");
        }
        else System.out.println("Non a strong number.");
    }
}