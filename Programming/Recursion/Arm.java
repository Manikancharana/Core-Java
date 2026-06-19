import java.util.Scanner;
class Arm{

	static int digit(int n){
	if(n==0) return 0;
	return 1+digit(n/10);
	}

	static int arm1(int n,int d){
		if(n==0) return 0;
		int arm=(int)Math.pow(n%10,d);
		return arm+arm1(n/10,d);		
	}

	static boolean isarm(int n){
	return arm1(n,digit(n))==n;
	}
		
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	
	if(isarm(n)){
	    System.out.println("Armstrong number");
	}
	else System.out.println("Not a armstrong number");
	}
}