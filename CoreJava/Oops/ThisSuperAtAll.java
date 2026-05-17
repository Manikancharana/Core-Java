import java.util.Scanner;
class A{
static Scanner sc=  new Scanner(System.in);
int a =sc.nextInt();
String m1(int a){
System.out.println(a);
System.out.println(this.a);
return sc.next();
}

long m1(float a){
System.out.println(a);
System.out.println(this.m1(sc.nextInt()));
return sc.nextLong();
}

A(int a){
System.out.println(a);
}
A(boolean a){
this(sc.nextInt());
System.out.println(a);
}
}
class ThisSuperAtAll extends A{
int a =sc.nextInt();
ThisSuperAtAll(){
super(sc.nextBoolean());
}
long m1(float a){
System.out.println(a);
System.out.println(super.a);
System.out.println(super.m1(sc.nextFloat()));
return sc.nextLong();
}
public static void main(String[] args){
ThisSuperAtAll x = new ThisSuperAtAll();
System.out.println(x.m1(sc.nextFloat()));
}
}