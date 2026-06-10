import java.util.Scanner;
interface Ab1{
	static Scanner sc = new Scanner(System.in);
	 
	int m1(String a);
	short m2(byte a);

	static String m3(float a){
	return sc.next();
	}
	
	default long m4(int a){
	return sc.nextLong();
	}
	
}
	
class Interface2 implements Ab1{
	public int m1(String a){
	return sc.nextInt();
	}
	public short m2(byte a){
	return sc.nextShort();
	}

	public static void main(String[] args){
	Ab1 x = new Interface2();
	System.out.println(x.m1(sc.next()));
	System.out.println(x.m2(sc.nextByte()));

	System.out.print(Ab1.m3(sc.nextFloat()));
	System.out.print(x.m4(sc.nextInt()));

}
}