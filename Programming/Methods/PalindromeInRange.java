package Programming.Methods;

import java.util.Scanner;

public class PalindromeInRange {
    static boolean ispalindrome(int n){
        int org = n,rev=0;

        while(n>0){
        int r =n%10;
        n=n/10;
        rev =rev *10 +r;
        }
       return rev==org;
    }
     public static void main(String[]arga){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=sc.nextInt();
        int sum=0;
        for(int i=n;i<=n1;i++){
           if(ispalindrome(i)){
            System.out.print(i +" "); 
            sum+=i;
           }
        }
        System.out.print(" \npalindrome sum : " + sum);
     }
}
