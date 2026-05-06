package CoreJava.Thiskeyword;

import java.util.Scanner;

public class MethodLevel {
    static Scanner sc = new Scanner(System.in);
   int sum=0;
   int n1=sc.nextInt();
    int m1(int n1, int n2){
         sum=n1+n2;
         System.out.println(this.m1(n1));
         return sum;
    }
    int m1(int n1){
        System.out.println(this.n1);
        return n1;
    }
    public static void main(String[] args){
       MethodLevel x = new MethodLevel();
       int a =sc.nextInt();
       int b=sc.nextInt();
       System.out.println(x.m1(a,b));
       sc.close();
    }
    
}
