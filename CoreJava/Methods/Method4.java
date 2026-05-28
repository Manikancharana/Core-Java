import java.util.Scanner;
class Method4{
	boolean m1(boolean b){
	     System.out.println("Hello, this is m1 method");
	     return b;
	 }
	static float m2(float f){
	     System.out.println("Hello, this is m2 method");
	     return f;
	}
	static int m3(int n){
	     System.out.println("Hello, this is m2 method");
	      return n;
	}
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    Method4 x= new Method4();
	    System.out.println("Enter boolean value ");
	    if(x.m1(sc.nextBoolean())){
                System.out.print("Enter Float value ");
                System.out.println(m2(sc.nextFloat()));
             }
	    else {
                System.out.print("Enter Intiger value ");
                System.out.println(m3(sc.nextInt()));
             }
	}
}