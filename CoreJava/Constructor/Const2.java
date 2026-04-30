package CoreJava.Constructor;

import java.util.Scanner;

public class Const2 {
    static Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
    float b = sc.nextFloat();
    long m1(short a){
     System.out.print(a);
     return sc.nextLong();
    }
    Const2(){
        System.out.println("helloo...");
         System.out.println(a);
         System.out.println(b);
    }
    public static void main(String[] args) {
        Const2 x = new Const2();
        System.out.println(x.a);
         System.out.println(x.b);
         System.out.println(x.m1(sc.nextShort()));
   sc.close();
    }
}
