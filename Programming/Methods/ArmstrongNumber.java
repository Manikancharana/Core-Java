package Programming.Methods;

import java.util.Scanner;

public class ArmstrongNumber {
    static void Armstrong(int n){
        int d=digitcount(n);
        int dup=n,arm=0;
        while(dup>0){
            int r = dup%10;
            dup/=10;
            arm+=(int)Math.pow(r, d);
        }
        if(arm==n){
            System.out.print("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }

    }
    static int digitcount(int n){
         int r=0;
        while (n>0) {
            n/=10;
            r++;
        }
        return r;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
            Armstrong(n);
    }
}
