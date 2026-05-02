package CoreJava.Methods;

import java.util.Scanner;

public class Method2 {
   static Scanner sc = new Scanner(System.in);
   static Method2 x = new Method2();
   int a=sc.nextInt();
   int b= sc.nextInt();
   static float c =sc.nextFloat();
   static boolean d = sc.nextBoolean();

   int m1(int a , short b){
    System.out.println(d);
    return a+b;
   }

   String m2 (String s){
    System.out.print(c);
    System.out.println(x.m1(sc.nextInt(),sc.nextShort()));
    return s;
   }


   public static void main(String[] args) {
    
    System.out.println(x.m2(sc.next()));
    System.out.println(x.a+"    "+ x.b);
   }

}
