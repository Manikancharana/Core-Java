import java.util.Scanner;
interface Ab{
	static Scanner sc = new Scanner(System.in);
	int a=0;
	// a=sc.nextInt(); //Show an error 
	int m1(String a);
	static String m2(float a){
	System.out.println(a);
	return sc.next();
	}
}
	
class Interface1 implements Ab{
	public int m1(String a){
	System.out.println(a);
	return sc.nextInt();
	}
	public static void main(String[] args){
	Ab x = new Interface1();
	System.out.println(x.m1(sc.next()));
	System.out.print(Ab.m2(sc.nextFloat()));
}
}