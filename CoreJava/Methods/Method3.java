package CoreJava.Methods;

import java.util.Scanner;

public class Method3 {
   static Scanner sc = new Scanner(System.in);
   static Method3 x = new Method3();

    Object m1(Object obj){
    return obj;
   }
   public static void main(String[] args) {
    Method3 x = new Method3();
    System.out.print(x.m1(new String(sc.next())));
   }

}
