	import java.util.Scanner;

abstract class Ab1{
	static Scanner sc = new Scanner(System.in);
	    abstract float m1(long a);

	    int m2(String a){
		System.out.println(a);
		return sc.nextInt();
	 	}
	}
abstract class Ab2 extends Ab1{
	
	abstract int m3(float a);
	String m4(int a){
	    System.out.println(a);
	    return sc.next();
	}
}

class Abclass3 extends Ab2{
	float m1(long a){
	    System.out.println(a);
	    return sc.nextFloat();
	 }
	int m3(float a){
		System.out.println(a);
		return sc.nextInt();
     	 }
	String m5(Short a){
	     System.out.println(a);
	     return sc.next();
	}
	
	long m6(byte a){
	    System.out.println(a);
	    return sc.nextLong();
	}
	 
	public static void main(String[]  args){
	   Scanner sc = new Scanner(System.in);
	   Ab1 x= new Abclass3();                      //Upcasting 
	   System.out.println(x.m1(sc.nextLong()));
	   System.out.println(x.m2(sc.next()));
	   Ab2 x1= (Ab2) x;
	   System.out.println(x1.m3(sc.nextFloat()));
	   System.out.println(x1.m4(sc.nextInt()));
	   Abclass3 x2 = (Abclass3) x1;
  	   System.out.println(x2.m5(sc.nextShort()));
	   System.out.println(x2.m6(sc.nextByte()));
	}
}


	


	   

