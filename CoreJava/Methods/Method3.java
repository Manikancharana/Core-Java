package CoreJava.Methods;

import java.util.Scanner;

public class Method3 {
   static Scanner sc = new Scanner(System.in);
   // static Method3 x = new Method3();

    static Method3 m1(){
    return new Method3();
   }

   void m2(){
      System.out.println("hi");
   }
   public static void main(String[] args) {
    
   m1().m2();
   }

}
