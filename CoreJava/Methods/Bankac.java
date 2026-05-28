import java.util.Scanner;
class Bankac{
	String acHolderName;
	String AcNumber;
	long balence;
	
	Bankac(String acHolderName, String AcNumber,long balence){
		this.acHolderName=acHolderName;
		this.AcNumber=AcNumber;
		this.balence=balence;
	}

	Bankac(Bankac x){
		acHolderName=x.acHolderName;
		AcNumber=x.AcNumber;
		balence=x.balence;
	}


	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
            System.out.println("Enter AcHoldername , Ac number, balence ");
	    Bankac x= new Bankac(sc.next(), sc.next(), sc.nextLong());
	    Bankac x1= new Bankac(x);

	    System.out.println("Original values : ");
	    System.out.println(x.acHolderName +"    " + x.AcNumber + "    "+ x.balence);
	    System.out.println("copied values : ");
	    System.out.println(x1.acHolderName +"    " + x1.AcNumber + "    "+ x1.balence);

	
	}
}