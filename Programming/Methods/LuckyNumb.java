//
package Programming.Methods;

import java.util.Scanner;

public class LuckyNumb {
    static void lucky(int n){
        int d=digitcount(n);
        while(true){
        if(d%10==d){
            if(d==1){
                System.out.println("lucky number");
                return;
            }
            else{
                System.out.print("Not a lucky Number");
                return;
            }
        }
        else{
            d=digitcount(d);
        }
    }

    }
    static int digitcount(int n){
        int x=0,sum=0;
        while (n>0) {
            int r=n%10;
            n/=10;
            sum+=r;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        lucky(n);
    }
}
