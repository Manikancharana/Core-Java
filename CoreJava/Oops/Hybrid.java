import java.util.Scanner;

class A{
static Scanner sc = new Scanner(System.in);
int v1=sc.nextInt();

int m1(String s){
System.out.println("Hello, "+s);
return sc.nexInt();
}
}
class B extends A{
float m2(int a){
System.out.println("Class B");
return sc.nextFloat();
}
}
class C extends A{
float m3(char c){
System.out.println("Class C "+c);
return sc.nextFloat();
}
class Hybrid extends C{
 Short m4(String s){
System.out.println("Hybride Inheritence");
return sc.nextShort();
}
public static void main(String[] args){
Hybrid x= new Hybrid();
C x1= new C();
B x2 = new B();
A x3 = new A();

System.out.println(x.m4(sc.next()));
System.out.println(x1.m3(sc.next().charAt(0));
System.out.println(x2.m2(sc.nextInt()));
System.out.println(x3.m1(sc.next()));

}
}