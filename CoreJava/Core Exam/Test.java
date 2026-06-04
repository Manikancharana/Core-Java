import java.util.Scanner;
class Gmail{
	static Scanner sc = new Scanner(System.in);
	static String email =sc.next() ;
	static String Password=sc.next();
	void update(String Password){
	   this.Password=Password;
	}
}

class Test{

     	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
	Gmail obj = new Gmail();
	Test x = new Test();
	x.m1(obj);
         }
	void m1(Gmail obj){
	   String email=obj.email;
	   String Password=obj.Password;
	   System.out.println("Enter email and Password ");
	   String newMail=sc.next();
	   String newPass=sc.next();

	   if(email.equals(newMail) && (Password.equals(newPass))){
		UpdatePass(obj);
	   }
	   else{
	       System.out.println("Invalid Credentials to login. ");
	   }
	}
	void UpdatePass(Gmail obj){
		System.out.println("Enter Password ");
		obj.update(sc.next());
		System.out.println("Password Updated Successfully ");

	}
}
	

