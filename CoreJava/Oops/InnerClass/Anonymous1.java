import java.util.Scanner;
interface Anonymous1{
	Scanner sc = new Scanner(System.in);
	int m1();
	float m2();
	static Anonymous1 x = new Anonymous1(){
        public int m1(){
		System.out.println("Hello i'm m1");
		return sc.nextInt();
	 }

	public float m2(){
		System.out.println("Hello i'm m2");
		return sc.nextFloat();
	}
	};
	public static void main(String[] args){

		System.out.println(x.getClass());
		System.out.println(x.m1());
		System.out.println(x.m2());;
	}
}

	