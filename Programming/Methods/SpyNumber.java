// package Programming.Methods;
import java.util.Scanner;

public class SpyNumber {
    static boolean isSpy(int n){
        int sum=0,mult=1;
        while(n>0){
            int r=n%10;
            n/=10;
            sum+=r;
            mult=mult*r;
        }
        return sum==mult;
    }
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(isSpy(n)){
            System.out.println("It's a SPY Number...");
        }
        else System.out.println("Not a SPY Number.");
    }
}
