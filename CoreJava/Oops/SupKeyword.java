//Create a java application where we have a class and call super at variable level;

import java.util.Scanner;
class A{
static Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
}
class SupKeyword extends A{
void var (){

int a=super.n;
System.out.println("Base class variable "+a);
}
public static void main(String[] args){
int n =sc.nextInt();
SupKeyword x = new SupKeyword();
System.out.println("local variable  "+n);
x.var();
}
}