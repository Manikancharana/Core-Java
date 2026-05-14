package CoreJava.Oops;

import java.util.Scanner;

public class SingleInheritence1 {
   static Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();  // while creating object memory allocate to non staic variables
   static String m1(int a){
    System.out.println(a);
    return sc.next();
   }
   float m2(short a){
    System.out.println(a);
     return sc.nextFloat();
   }
   SingleInheritence1(){
    System.out.println("Parent class Constructor");
   }
}
class A extends SingleInheritence1{
   static String a=sc.next();  // 1st memory allocate to staic varibles 
double m3(boolean a){
    System.out.println(a);
    return sc.nextDouble();
}
public static void main(String[] args){
    A x = new A();   //call parent class Constructor and memory allocate to non static variables
    System.out.println(m1(sc.nextInt()));
    System.out.println(x.m2(sc.nextShort()));
    System.out.println(x.m3(sc.nextBoolean()));
}
}
