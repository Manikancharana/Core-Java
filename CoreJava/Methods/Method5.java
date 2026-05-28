import java.util.Scanner;
class Method5{
	static Scanner sc = new Scanner(System.in);
	static int a=sc.nextInt();
	static float b=sc.nextFloat();
	String s=sc.next();
	char ch=sc.next().charAt(0);
	String m1(String a){
	System.out.println("Hello, I'm M1 method..");
	return a;
	}
	public static void main(String[] args){
	    Method5 x = new Method5();
	    int s=sc.nextInt();
	    int s1=sc.nextInt();
	    System.out.println(x.m1(sc.next()));
	    System.out.println("Local var's " + s + "  "+ s1 );
	    System.out.println("Static var's  " +a +"    " +b);
	    System.out.println("Non Static var's " +x.s +"   "+ x.ch);
	    
	}
}