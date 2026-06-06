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
	System.out.println("para constructor..."+a);
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
	A(){
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
	B(){
	super(sc.nextInt());
	}
	
}
class C extends Ab1{
	int m1(String a){
	System.out.println(a);
	return sc.nextInt();
	}
	
	float m2(long a){
	System.out.println(a);
	return sc.nextFloat();
	}
	C(){
	super(sc.nextInt());
	}
}

class Abclass5{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value 1. Class A \n 2.Class B \n 3.class C ");
	int n=sc.nextInt();

	if(n==1){
	   Ab1 x= new A();
	   System.out.println(x.m1(sc.next()));
	   System.out.println(x.m2(sc.nextLong()));
	}
	else if(n==2){
	   Ab1 x1= new B();
	   System.out.println(x1.m1(sc.next()));
	   System.out.println(x1.m2(sc.nextLong()));
	}
	else if(n==3){
	Ab1 x2= new C();
	   System.out.println(x2.m1(sc.next()));
	   System.out.println(x2.m2(sc.nextLong()));
	}
	else{
	System.out.println("Enter valid value");
	}
}
}

