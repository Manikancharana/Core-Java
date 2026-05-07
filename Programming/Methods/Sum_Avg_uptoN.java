package Programming.Methods;

import java.util.Scanner;

public class Sum_Avg_uptoN {
   static void uptoN(int n){
        int a=0,b=1,sum=0,ch=0;
        while(a<=n){
            // System.out.println(a+" ");
            sum+=a;
            ch++;
            int c= a+b;
            a=b;
            b=c;
            }
            System.out.println("Sum is : "+sum);
            System.out.printf("%.3f",(float)sum/ch);
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        uptoN(n);
        sc.close();
    }
}
