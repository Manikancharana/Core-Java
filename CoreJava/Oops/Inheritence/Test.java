import java.util.Scanner;
class UPIpay{
   static Scanner sc = new Scanner(System.in);
   static String bankName=sc.next();
   static String upiId=sc.next();
}

class Gpay extends UPIpay{
     void pay(){
	System.out.println(bankName +"    "+ upiId);
	    System.out.println("Payment done using Gpay.  ");
	}
}

class Phonepay extends UPIpay{
     void pay(){
	System.out.println(bankName +"    "+ upiId);
	    System.out.println("Payment done using Phonepay.  ");
	}
}

class Cvpay extends UPIpay{
     void pay(){
	System.out.println(bankName +"    "+ upiId);
	    System.out.println("Payment done using Cvpay.  ");
	}
}

class Test{
	public static void main(String[]  args){
	   Gpay x = new Gpay();
	   Phonepay y = new Phonepay();
	   Cvpay z= new Cvpay();
	   x.pay();
 	   y.pay();
	   z.pay();
	}
}