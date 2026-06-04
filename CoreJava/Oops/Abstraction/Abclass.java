import java.util.Scanner;

abstract class Ab{
	static Scanner sc = new Scanner(System.in);
	abstract int m1(String a);
	abstract long m2(float a);

	static short m3(long a){
	    System.out.println(a);
	    return sc.nextShort();
	}
	
	boolean m4(int a){
	     System.out.println(a);
	     return sc.nextBoolean();
	}

	Ab(float a){
	    System.out.println(a);
	}
}

class Abclass extends Ab{
	int m1(String a){
	     System.out.println(a);
	     return sc.nextInt();
	}

	long m2(float a){
	    System.out.println(a);
	    return sc.nextLong();
	}
	Abclass(){
	    super(sc.nextFloat());
	}

	public static void main(String[] args){
		Abclass x = new Abclass();
		System.out.println(x.m1(sc.next()));
	        System.out.println(x.m2(sc.nextFloat()));
	    	System.out.println(x.m3(sc.nextShort()));
		System.out.println(x.m4(sc.nextInt()));
        }
  }