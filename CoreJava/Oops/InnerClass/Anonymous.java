import java.util.Scanner;
abstract class Anonymous{
	Scanner sc = new Scanner(System.in);
	abstract int m1();
	abstract float m2();
	static Anonymous x = new Anonymous(){
        int m1(){
		System.out.println("Hello i'm m1");
		return sc.nextInt();
	 }

	float m2(){
		System.out.println("Hello i'm m2");
		return sc.nextFloat();
	}
	};
	public static void main(String[] args){

		System.out.println(x.getClass());
		System.out.println(x.m1());
		System.out.println(x.m2());;
	}
}

	