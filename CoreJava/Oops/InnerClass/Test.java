import java.util.Scanner;
class Outer1{
	static Scanner sc = new Scanner(System.in);
	private String a=sc.next();

	int m1(float a){
	   System.out.println("Hello varun I'm m1 method "+a);
	return sc.nextInt();
	}
	
	static class Inner{
		
		static String m2(Outer1 x){
			 System.out.println("Hello I'm m3  ");
		 	 System.out.println("private var  " +x.a);
		return sc.next();
		}
		float m3(Outer1 x){
		     System.out.println("Hello I'm m2 ");
		     System.out.println("private var  " +x.a);
		  return sc.nextFloat();
		}
	}
}
class Test{
public static void main(String []  args){
	Scanner sc=  new Scanner(System.in);
	Outer1 x = new Outer1();
	Outer1.Inner x1 = new Outer1.Inner();	
	System.out.println(x.m1(sc.nextFloat()));
	System.out.println(x1.m2(x));
	System.out.println(x1.m3((x)));
}
}

