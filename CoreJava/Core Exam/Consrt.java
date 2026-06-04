import java.util.Scanner;
class Main1{
	static Scanner sc = new Scanner(System.in);
	String a=sc.next();
	Main1(int a){
	System.out.println("Local variable " +a);
	System.out.println("Instance variable " +this.a);
	System.out.println("Parameterised constructor ");
	}
	 int m1(){
	   System.out.println("I'm m1 method");
	   return sc.nextInt();
	}
}
class Consrt extends Main1{
	 Consrt(){
	   this(sc.nextInt());
	   System.out.println("Default const in child class ");
	}
	Consrt(int a){
	   super(sc.nextInt());
	   System.out.println("Default const in child class ");
	   System.out.println(super.m1());
	   System.out.println(a);
	}
	
	public static void main(String[] args){
	Consrt x= new Consrt();
	}
}