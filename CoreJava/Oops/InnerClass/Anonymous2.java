import java.util.Scanner;
 abstract class A{
	Scanner sc = new Scanner(System.in);
	abstract int m1(String a);
	abstract float m2(int a);

	int m3(int a){
	System.out.println("Hello i'm m3 "+a);
	return sc.nextInt();
	}
	
	String m4(int a){
	System.out.println("Hello i'm m4 "+a);
	return sc.next();
	}
	
	A(String a){
	System.out.println(a);
	}
	}
	class Anonymous2 {
	static Scanner sc= new Scanner(System.in);
	static A x = new A(sc.next()){

	int m1(String a){
	System.out.println("Hello i'm m1 "+a);
	return sc.nextInt();
	}
	
	float m2(int a){
	System.out.println("Hello i'm m2 "+a);
	return sc.nextFloat();
	}
	};
	public static void main(String[] args){
	System.out.println(x.m1(sc.next()));
	System.out.println(x.m2(sc.nextInt()));
	System.out.println(x.m3(sc.nextInt()));
	System.out.println(x.m4(sc.nextInt()));
	}
	}