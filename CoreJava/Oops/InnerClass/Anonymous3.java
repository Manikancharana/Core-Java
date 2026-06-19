import java.util.Scanner;
interface A1{
	void m5();
	void m6();
	}

 abstract class Anonymous3{
	static Scanner sc = new Scanner(System.in);
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
	static Anonymous3 x = new Anonymous3(sc.next()){

	int m1(String a){
	System.out.println("Hello i'm m1 "+a);
	return sc.nextInt();
	}
	
	float m2(int a){
	System.out.println("Hello i'm m2 "+a);
	return sc.nextFloat();
	}
	};
	 static A1 x1 = new A1(){
		public void m5(){
			System.out.println("Hello im m5 ");
		}
		public void m6(){
			System.out.println("Hello i'm m6 ");
		}
	};
	
	Anonymous3(String a){
	System.out.println(a);
	}
	
	public static void main(String[] args){
	System.out.println(x.m1(sc.next()));
	System.out.println(x.m2(sc.nextInt()));
	System.out.println(x.m3(sc.nextInt()));
	System.out.println(x.m4(sc.nextInt()));
	x1.m5();
	x1.m6();
	}
	}

