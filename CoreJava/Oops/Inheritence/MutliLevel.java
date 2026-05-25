package CoreJava.Oops.Inheritence;

import java.util.Scanner;

class A {
    static Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String greet(String a){
        System.out.println("Hello... "+a);
        return sc.next();
    }
}
class B extends A{
     int num(byte a){
        System.out.println(a);
     return sc.nextInt();
     }
     static float m(char c){
        System.out.println(c);
        return sc.nextFloat();
     }
}
public class MutliLevel extends B {
    boolean m1 (float a){
        System.out.println(a);
        return sc.nextBoolean();
    }
    public static void main(String[] args){
      MutliLevel x=new MutliLevel();
      System.out.println(x.greet(sc.next()));
      System.out.println(x.num(sc.nextByte()));
      System.out.println(m(sc.next().charAt(0)));
      System.out.println(x.m1(sc.nextFloat()));
    }
}
