package CoreJava.Methods;
import java.util.Scanner;
class User{
	String Username;
	String Password;
        void m1(String Username,String Password){
		this.Username=Username;
		this.Password=Password;
	}
	User(){
		this.Username="Mani";
		this.Password="Mani123";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		User x = new User();
	        System.out.println("Default Values : ");
		System.out.print(x.Username +"   ");
		System.out.println(x.Password);
		System.out.println("Enter new Username and password ");
                x.m1(sc.next(),sc.next());
		System.out.println("Updated Username and password ");
		System.out.print(x.Username+ "   ");
		System.out.println(x.Password);
	  sc.close();
     }
}