import java.util.Scanner;
abstract class Ab1{
	static Scanner sc = new Scanner(System.in);
	abstract int m1(String a);
	abstract float m2(long a);
	
	boolean m3(long a){
	System.out.println(a);
	return sc.nextBoolean();
	}
	Ab1(int a){
	System.out.println("parent class parameter constructor..."+a);
	}

}
class A extends Ab1{
	int m1(String a){
	System.out.println(a);
	return sc.nextInt();
	}
	
	float m2(long a){
	System.out.println(a);
	return sc.nextFloat();
	}
	 
	boolean m4(int a){
	System.out.println(a);
	return sc.nextBoolean();
	}
	
	String m5(short a){
	System.out.println(a);
	return sc.next();
	}

	A(){
	System.out.println("Class A parameter ");
	super(sc.nextInt());
	}
}

class B extends Ab1{
	int m1(String a){
	System.out.println(a);
	return sc.nextInt();
	}
	
	float m2(long a){
	System.out.println(a);
	return sc.nextFloat();
	}

	boolean m6(int a){
	System.out.println(a);
	return sc.nextBoolean();
	}
	
	String m7(short a){
	System.out.println(a);
	return sc.next();
	}
	B(){
	System.out.println("Class B parameter ");
	super(sc.nextInt());
	}
	
}

class Abclass6 {
	static Scanner sc = new Scanner(System.in);
	void blender(Ab1 x , int n){
	    if(n==1){
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextLong()));
		System.out.println(x.m3(sc.nextLong()));

		A x2 = (A)x;
		System.out.println(x2.m4(sc.nextInt()));
		System.out.println(x2.m5(sc.nextShort()));
		}
	    else{
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextLong()));
		System.out.println(x.m3(sc.nextLong()));

		B x3 = (B)x;
		System.out.println(x3.m6(sc.nextInt()));
		System.out.println(x3.m7(sc.nextShort()));
		}
		
	
	}
	
	public static void main(String[] args){
	System.out.println("Enter 1 for Class A \n   2 for class B");
	int n=sc.nextInt();
	Abclass6 ob =new Abclass6();
	switch(n){
	case 1 : Ab1 x = new A();
		 ob.blender(x,n);
		 break;
	case 2 : Ab1 x1 = new B();
		 ob.blender(x1,n);
		 break;
	default : System.out.println("Invalid choise");
		 
	        }
	}
}
