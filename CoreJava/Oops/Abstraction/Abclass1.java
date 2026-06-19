import java.util.Scanner;
abstract class Ab{
	static Scanner sc = new Scanner(System.in);
	abstract int m1(String a);
	String m2(int a){
	   System.out.println(a);
	   return sc.next();
	}
	Ab(){
	System.out.println("Default parent class cons");
	}
}
class Abclass1 extends Ab{
	int m1(String a){
	   System.out.println(a);
	   return sc.nextInt();
	}

	Abclass1(){
	System.out.println("child class default cons ");
	}
	public static void main(String[] args){
		Abclass1 x = new Abclass1();
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextInt()));
	}
	
}
