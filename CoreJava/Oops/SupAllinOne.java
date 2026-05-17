import java.util.Scanner;
class A{
Static Scanner sc = new Scanner(System.in);
int n =sc.nextInt();
String m1 (int a){
System.out.println(a);
return sc.next();
}
A(){
System.out.println("Super class constructor...");
}

class SupAllinOne extends A{
int n=sc.nextInt();
String m1(int a){
System.out.println(a);
System.out.println("Parent class variable  "+super.n);
System.out.println("Derived class variable  "+n);
System.out.println("Parent class method  "+super.m1(sc.nextInt());
return sc.next();
}
SupAllinOne(){
super();
System.out.println("Derived class constructor....");
}
public static void main(String[]  args){
SupAllinOne x = new SupAllinOne();
x.m1(sc.nextInt());
}
}