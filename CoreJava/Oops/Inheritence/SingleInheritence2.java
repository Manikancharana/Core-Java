package CoreJava.Oops.Inheritence;

import java.util.Scanner;

public class SingleInheritence2 {
   static Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();  
   static String m1(int a){
    System.out.println(a);
    return sc.next();
   }
   float m2(short a){
    System.out.println(a);
     return sc.nextFloat();
   }
}
class A extends SingleInheritence2{
    String a=sc.next(); 
double m3(boolean a){
    System.out.println(a);
    return sc.nextDouble();
}
public static void main(String[] args){
    A x = new A();
    System.out.println(m1(sc.nextInt()));
    System.out.println(x.m2(sc.nextShort()));
    System.out.println(x.m3(sc.nextBoolean()));
}
}
