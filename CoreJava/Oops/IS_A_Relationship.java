import java.util.Scanner;
class A{
static Scanner sc = new Scanner(System.in);
String a=sc.next();
int m1(float a){
System.out.println(a);
System.out.println(this.a);
return sc.nextInt();
}
}
class RelationshipTypes extends A{
int n = sc.nextInt();
  long m1(byte n){
System.out.println(n);
System.out.println(this.n);
System.out.println(super.m1(sc.nextFloat()));
return sc.nextLong();
}
public static void main(String[] args){
RelationshipTypes x = new RelationshipTypes();
System.out.println(x.m1(sc.nextByte()));
}
}
