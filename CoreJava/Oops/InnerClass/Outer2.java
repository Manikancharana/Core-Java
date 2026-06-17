import java.util.Scanner;
class Outer{
	Scanner sc = new Scanner(System.in);
	private String s =sc.next();
	static void m1(){
	System.out.println("Static method m1");
	}
	Outer(int a){
	System.out.println("Outer constructor ");
	}

	static class Inner {
   	 static void m2(Outer x){
	 System.out.println("Static method m2");
	 System.out.println(x.s);

	 }

	 Inner(int a){
	 System.out.println("Inner constructor ");
	 }
	}
    }
class Outer2 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	Outer x= new Outer(sc.nextInt());
	Outer.m1();
	Outer.Inner x1 = new Outer.Inner(sc.nextInt());
	Outer.Inner.m2(x);
}
}
	