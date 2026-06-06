import java.util.Scanner;

class Cc{
	static Scanner sc =new Scanner(System.in);
	int m1(String a){
	    System.out.println(a);
	    return sc.nextInt();
	}

	Cc(int a){
	    System.out.println("Parent parameter Cons");
	}
	}

abstract class Ab1 extends Cc{
	abstract long m2(float a);
	String m3(long a){
	      System.out.println(a);
	      return sc.next();
	}
	
	Ab1(){
	  System.out.println("Hello, i'm class Ab1");
	  System.out.println("Hello, i'm class Ab1");
	  int a=7;
	  System.out.println("Hello, i'm class Ab1"+ a);
	  super(sc.nextInt());

	}
}
class B extends Ab1{
	long m2(float a){
	    System.out.println(a);
	    return sc.nextLong();
	}
	
	
}

class Abclass2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	B x= new B();
	System.out.println(x.m1(sc.next()));
	System.out.println(x.m3(sc.nextLong()));
	System.out.println(x.m2(sc.nextFloat()));
}
}
