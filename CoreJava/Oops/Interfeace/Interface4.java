import java.util.Scanner;
abstract class A{
	static Scanner sc = new Scanner(System.in);
	abstract int m1(long n);
	abstract float m2(byte n);
	
	int m3(String a){
	return sc.nextInt();
	}

	A(String a){
	System.out.println("Constructor");
	}
}
interface Ab1{
	static Scanner s = new Scanner(System.in);

	int m4(String a);
	
	default long m5(int a){
	return s.nextLong();
	}
}

class Interface4 extends A implements Ab1{
	int m1(long n){
	return sc.nextInt();
	}

	float m2(byte n){
	return sc.nextFloat();
	}

	float m6(byte a){
	return sc.nextFloat();
	}

	public int m4(String a){
	System.out.println("Parent interface");
	return sc.nextInt();
	}
	
	Interface4(){
	super(sc.next());
	}

	public static void main(String [] args){
		A x = new Interface4();
		System.out.println(x.m1(sc.nextLong()));
		System.out.println(x.m2(sc.nextByte()));
		System.out.println(x.m3(sc.next()));
		Ab1 x2 =(Interface4)x;
		System.out.println(x2.m4(sc.next()));
		System.out.println(x2.m5(sc.nextInt()));

	}	
}