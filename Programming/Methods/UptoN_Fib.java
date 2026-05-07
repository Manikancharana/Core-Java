package Programming.Methods;

import java.util.Scanner;

public class UptoN_Fib {
    static void uptoN(int n){
        int a=0,b=1;
        // while(a<=n){
        for(int i=1;i<=n;i++){
            if(a<=n){         // condition for checking a lessthan or equal to n 
            System.out.println(a+" ");
            int c= a+b;
            a=b;
            b=c;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        uptoN(n);
        sc.close();
    }
}
