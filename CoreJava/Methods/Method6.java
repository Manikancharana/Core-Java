import java.util.Scanner;
class Method6{
	static Scanner sc = new Scanner(System.in);
	 boolean m1(boolean a){
	    System.out.println("Hello this m1  ");
	    return a;
	}
	boolean m2(boolean a){
	   System.out.println("Hello this m2 ");
	   return a;
	}
	boolean m3(String a){
	    System.out.print("Hello this is m3 "+a +"   ");
	    return sc.nextBoolean();
	}

	public static void main(String[] args){
	    Method6 x= new Method6();
	    System.out.println(x.m1(x.m2(x.m3(sc.next()))));
	}
}