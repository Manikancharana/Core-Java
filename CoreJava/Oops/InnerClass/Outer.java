import java.util.Scanner;
class Outer{
	static Scanner sc = new Scanner(System.in);
	private String a=sc.next();

	int m1(float a){
	    System.out.println("Hello varun I'm m1 method "+a);
	return sc.nextInt();
	}
	
	class Inner{
		float m2(String m){

		     System.out.println("Hello I'm m2 ");
		   //  System.out.println("private var  " +this.a);  // It can use only in cuurent class.
		     System.out.println("private var  " +a);
		return sc.nextFloat();
		}
	}
	public static void main(String[] args){
		Outer x = new Outer();
		System.out.println(x.m1(sc.nextFloat()));
		Outer.Inner x1=x.new Inner();
		System.out.println(x1.m2(sc.next()));
		
	}
}