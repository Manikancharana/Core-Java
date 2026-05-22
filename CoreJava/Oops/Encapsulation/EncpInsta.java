package CoreJava.Oops;
import java.util.Scanner;

class Insta{
static String password ="Mani123";     //Data Hiding
void setPass(String password){         //used to Update or Reset Private fields
this.password=password;
}
String getPass(){                       // used to Display Private fields
return password;
}
}
class EncpInsta{
Scanner sc = new Scanner(System.in);
void m1(){
Insta obj = new Insta();                      // Has-A relationship
System.out.println(obj.getPass());
obj.setPass(sc.next());
System.out.println(obj.getPass());
}
public static void main(String[] args){
  EncpInsta x = new EncpInsta();
  x.m1();
}
}
