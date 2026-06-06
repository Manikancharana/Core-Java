import java.util.Scanner;
abstract class Ab1{
	static Scanner sc = new Scanner(System.in);
	abstract int m1(String a);
	abstract float m2(long a);
	
	boolean m3(long a){
	System.out.println(a);
	return sc.nextBoolean();
	}

}
class Abclass4 extends Ab1{
	int m4(float a){
	System.out.println(a);
	return sc.nextInt();
	}

	long m5(short a){
	System.out.println(a);
	return sc.nextLong();
	}

	int m1(String a){
	System.out.println(a);
	return sc.nextInt();
	}
	
	float m2(long a){
	System.out.println(a);
	return sc.nextFloat();
	}
	
	public static void main(String[]  args){
	Ab1 x = new Abclass4();
	System.out.println(x.m1(sc.next()));
	System.out.println(x.m2(sc.nextLong()));
	System.out.println(x.m3(sc.nextLong()));
	Abclass4 x1=(Abclass4) x;
	System.out.println(x1.m4(sc.nextFloat()));
	System.out.println(x1.m5(sc.nextShort()));

	}
}


	