package CoreJava.Constructor;

import java.util.Scanner;

public class SingleLineParacons {
    static Scanner sc = new Scanner(System.in);
    int sum=0;

    SingleLineParacons(){
        System.out.println("Default Constructor");
    }
    SingleLineParacons(int n , SingleLineParacons obj){
        if(n>0)
            System.out.println(n+" is positive number");
        else
            System.out.println(n+ " is negitive Number");
    }
    SingleLineParacons(int a, int b, SingleLineParacons obj){
        sum=a+b;
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args){
        SingleLineParacons x= (new SingleLineParacons(sc.nextInt(),sc.nextInt(),(new SingleLineParacons(sc.nextInt(),(new SingleLineParacons())))));
    }
}
