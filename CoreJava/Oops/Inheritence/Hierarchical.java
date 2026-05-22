package CoreJava.Oops;
import java.util.*;
class A{
  static Scanner sc = new Scanner(System.in);
  String n=sc.next();
  void greet(){
    System.out.println("Hello, "+n);
  }
}
class B extends A{
    int n=sc.nextInt();
    void m1(){
        System.out.println("Class B " +n);
    }
}
class C extends A{
    char n=sc.next().charAt(0);
    void m2(){
        System.out.println("Class C "+ n);
    }
}

public class Hierarchical extends A {
  boolean n=sc.nextBoolean();
  void m3(){
    System.out.println("Main class "+n);
  }
    public static void main(String[]  args){
        Hierarchical x= new Hierarchical();
        B x1= new B();
        C x2 = new C();
        x.m3();
        x.greet();
        x1.m1();
        x2.m2();
    }
}