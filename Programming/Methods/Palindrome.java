package Programming.Methods;

import java.util.Scanner;

public class Palindrome {
    static void palin(int n){
        int rev =0,org=n;
        while (n>0){
            int r = n%10;
            n=n/10;
            rev=rev*10+r;
        } 
        if(org==rev)
            System.out.print("Its a palindrome ");
        else
            System.out.print("Not a palindrome");
    }
    public static void main(String[]arga){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palin(n);
    }
}

