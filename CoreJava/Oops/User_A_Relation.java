package CoreJava.Oops;
import java.util.Scanner;
class A{
static Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
String m1(int n){
System.out.println("Local variable "+n);
System.out.println("Local variable "+this.n);
return sc.next();
}
A(){
this(sc.nextInt());
System.out.println("Parent class Constructor");
}
A(int n){
System.out.println("Base class Constructor with parameter is " +n);
}
}

class User_A_Relation{
static Scanner sc = new Scanner(System.in);
User_A_Relation(){
this(sc.nextInt());
System.out.println("Child class Constructor ");
}

User_A_Relation(int a){
System.out.println("derived class Constructor with parameter is " +a);
}

void m2(){
A obj = new A();
System.out.println(obj.m1(sc.nextInt()));
}

public static void main(String[] args){
User_A_Relation x = new User_A_Relation();
x.m2();
}
}