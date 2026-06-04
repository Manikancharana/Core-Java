import java.util.Scanner;
class Main{
	static Scanner sc = new Scanner(System.in);
	static int a=sc.nextInt();
	static int b=sc.nextInt();
	float x=sc.nextFloat();
	float y=sc.nextFloat();

	static int m1(Main obj){
	   obj.m2(sc.nextInt());
	   System.out.println(obj.x);
	   System.out.println(obj.y);
	   return sc.nextInt();
	}
	
	float m2(int z){
	   System.out.println(z);
	   System.out.println(a);
	   System.out.println(b);
	   return sc.nextFloat();
	}

	public static void main(String[] args){
	   Main obj = new Main();
	    System.out.println(m1(obj));
	   }
}