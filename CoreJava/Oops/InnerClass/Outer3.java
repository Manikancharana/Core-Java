import java.util.Scanner;
class Outer3{
	static Scanner sc = new Scanner(System.in);
	
	int m1(float a){
	    System.out.println("Hello varun I'm m1 method "+a);
		class Inner{
		void m2(){
		     System.out.println("Hello I'm m2 ");
		}
	    }
		Inner x1 =new Inner();
		x1.m2();		

	   return sc.nextInt();
	}
	
	public static void main(String[] args){
		Outer3 x = new Outer3();
		System.out.println(x.m1(sc.nextFloat()));

	}
}