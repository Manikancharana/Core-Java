import java.util.Scanner;
class Outer1{
	static Scanner sc = new Scanner(System.in);
	private String a=sc.next();

	int m1(float a){
	    System.out.println("Hello varun I'm m1 method "+a);
	return sc.nextInt();
	}
	
	Outer1(int n){
	System.out.println("Outerclass constructor   "+n);
	}
	
	class Inner{
		Inner(int a){
		System.out.println("Inner class Constructor  "+ a);
		}
		float m2(String m){

		     System.out.println("Hello I'm m2 ");
		     System.out.println("private var  " +a);
		return sc.nextFloat();
		}
	}
	public static void main(String[] args){
		Outer1 x = new Outer1(sc.nextInt());
		System.out.println(x.m1(sc.nextFloat()));
		Outer1.Inner x1=x.new Inner(sc.nextInt());
		System.out.println(x1.m2(sc.next()));
		
	}
}