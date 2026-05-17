// Statisfy super keyword at method level.
import java.util.Scanner;
class A{
static Scanner sc = new Scanner(System.in);
void greet(String s){
System.out.println("Hello, im in parent class  "+s);
}
}
class SupMethod extends A{

void greet(String s){
super.greet(sc.next());
System.out.println("Hiii  im in Child class "+s);
}

public static void main(String[] args){
  SupMethod x= new SupMethod();
  x.greet(sc.next());
}
}