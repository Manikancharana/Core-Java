// If sum of factors (excluding itself) equals the number.
// 6 → 1 + 2 + 3 = 6

package Programming.Methods;

import java.util.Scanner;

public class Perfect {
    static boolean isperf(int n){
        int org=n,sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
            sum+=i;
            }
        }
        return org==sum;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    if(isperf(n)){
        System.out.print("Perfect number...");
    }
    else
        System.out.print("Not a perfect number.");
    }
}
