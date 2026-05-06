package Programming.Methods;

import java.util.Scanner;

public class AltFibonacciSum {
    static void fib(int n){
        int a=0,b=1,sum=0;
      for(int i=1;i<=n*2;i++){
        if(i%2==1){
        sum+=a;
        }
        int c= a+b;
        a=b;
        b=c;
      }
      System.out.print(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
}
