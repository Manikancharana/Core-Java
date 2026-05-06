package Programming.Methods;
import java.util.Scanner;

public class FibonacciSum {
    static void fib(int n){
        int a=0,b=1,sum=0;
      for(int i=1;i<=n;i++){
        sum+=a;
        int c= a+b;
        a=b;
        b=c;
      }
      System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
}
