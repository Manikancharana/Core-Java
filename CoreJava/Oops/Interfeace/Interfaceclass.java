import java.util.Scanner;
 interface I{
	int m1(String a);
	}
 class Interfaceclass implements I{
	static Scanner sc = new Scanner(System.in);
	public int m1(String a){
		System.out.println(a);
		return sc.nextInt();
	}
	public static void main(String [] args){
		I x = new Interfaceclass();
		System.out.println(x.m1(sc.next()));
	}	
}