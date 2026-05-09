package Programming.Methods;

import java.util.Scanner;

public class NearestPrime {
    static void nearest(int n){
        int a =prevPrime(n);
        int b= afterPrime(n);
        if((n-a)>(b-n)){
            System.out.println("nearest number "+b);
        }
        else if (a==b){
            System.out.println("nearest number "+a+"   "+b);
        }
        else{
            System.out.println("nearest number "+a);
        }
    }
    static int prevPrime(int n){
        for(int i=n-1;i>=2;i--){
            if(isPrime(i)){
                return i;
            }
        }
        return 1;
    }
    static int afterPrime(int n){
        for(int i=n+1;true;i++){
            if(isPrime(i)){
                return i;
            }
        }
    }

    static boolean isPrime(int n){
        int fc=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                fc++;
            }
        }
        if(fc==0 && n>1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        nearest(n);
    }
}
