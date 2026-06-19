import java.util.Scanner;
class Palindrome{
	static int palin(int n , int rev){
		if(n==0) return rev;
		return palin(n/10,rev*10+n%10);
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt(),rev=0;
	rev=palin(n,rev);
	if(n==rev) System.out.println("Palindrome ");
	else System.out.println("Not a palindrome ");
}
}