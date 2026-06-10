import java.util.Scanner;
interface Ab1{
	static Scanner sc = new Scanner(System.in);
	 
	int m1(String a);
	
	default long m2(int a){
	return sc.nextLong();
	}
}
interface Ab2 extends Ab1{

	int m3(String a);
	
	default long m4(int a){
	return sc.nextLong();
	}
}
abstract class A implements Ab1,Ab2{
	
	abstract int m5(long n);
	abstract float m6(byte n);
	
	int m7(String a){
	return sc.nextInt();
	}

	
	
	A(String a){
	System.out.println("Constructor");
	}
}

class Interface3 extends A{

	public int m1(String a){
	System.out.println("Parent interface");
	return sc.nextInt();
	}

	public int m3(String a){
	System.out.println("Parent interface");
	return sc.nextInt();
	}
	
	int m5(long n){
	return sc.nextInt();
	}

	float m6(byte a){
	return sc.nextFloat();
	}
	Interface3(){
	super(sc.next());
	}

	public static void main(String[] args){
		A x = new Interface3();
		System.out.println(x.m5(sc.nextLong()));
		System.out.println(x.m6(sc.nextByte()));
		A x1=(Interface3)x;
		System.out.println(x1.m7(sc.next()));
		Ab2 x2 =(Interface3)x;
		System.out.println(x.m3(sc.next()));
		System.out.println(x.m4(sc.nextInt()));
		Ab1 x3 =(Interface3)x;
		System.out.println(x3.m1(sc.next()));
		System.out.println(x3.m2(sc.nextInt()));

	}
}

	