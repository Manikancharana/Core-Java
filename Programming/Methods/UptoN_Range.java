package Programming.Methods;

import java.util.Scanner;

public class UptoN_Range {
    static void uptoN(int n,int n1){
        int a=0,b=1,sum=0,ch=0;
        int sum1=0,h=0;
        while(a<=n1){
            if(a>=n){    
            // System.out.println(a+" ");
            ch++;
            if(ch%2==1){
                 System.out.println(a+" ");
                 h++;
                 sum1+=a;
            }
            // sum+=a; //sum of Fibonacci in range
            }
            int c= a+b;
            a=b;
            b=c;
        }
        // System.out.println("Sum is : "+sum);                        //sum and avg of fibonacci in given range
        // System.out.printf("Average is : "+"%.3f",(float)sum/ch);

        System.out.println("Sum is : "+sum1);                          // sum and avg of alternate fabonaci in given range
        System.out.printf("Average is : "+"%.3f",(float)sum1/h);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int n1 =sc.nextInt();
        uptoN(n,n1);
        sc.close();
    }
}
