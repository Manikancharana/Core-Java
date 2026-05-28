import java.util.Scanner;
class Numconv{
	static int bintodec(String bin){
		int dec=0,p=0;
		for(int i=bin.length()-1;i>=0;i--){
		    char ch=bin.charAt(i);
		    if(ch=='0' || ch=='1'){
			dec+=(int)(ch-48)*Math.pow(2,p++);
		    }
		}
          return dec;
	}

	static int octtodec (String bin){
		int dec=0,p=0;
		for(int i=bin.length()-1;i>=0;i--){
		    char ch=bin.charAt(i);
		    if(ch>='0' && ch<='7'){
			dec+=(int)(ch-48)*Math.pow(8,p++);
		    }
		}
          return dec;
	}

	static int hdtodec(String bin){
		int dec=0,p=0;
		for(int i=bin.length()-1;i>=0;i--){
		    char ch=bin.charAt(i);
		    if(ch>='0' && ch<='9'){
			dec+=(int)(ch-48)*Math.pow(16,p++);
		    }
		    else{
			dec+=(int)(ch-55)*Math.pow(16,p++);
		     }
                 }
          return dec;
}

	static String dectobin(int dec){
	    String bin="";
	    if(dec==0){
		return "0";
	     }
	    while(dec>0){
	  	int r=dec%2;
		dec/=2;
		bin=r+bin;
	}
	return bin;
        }

	static String dectoOct(int dec){
	    String oct="";
	    if(dec==0){
		return "0";
	     }
	    while(dec>0){
	  	int r=dec%8;
		dec/=8;
		oct=r+oct;
	}
	return oct;
        }

	static String dectohd(int dec){
	    String hd="";
	    if(dec==0){
		return "0";
	     }
	    while(dec>0){
	  	int r=dec%16;
		dec/=16;
		if(r<=9){
 		   hd=r+hd;
		}
		else{
 		   hd=(char)(r+55)+hd;
		}
	}
	return hd;
        }



	public static void main(String[] args){
	     Scanner sc = new Scanner(System.in);
             int n=1;
	     do{
	     System.out.println("1. Binary to decimal");
	     System.out.println("2. Oct to decimal");
	     System.out.println("3. Hexa to decimal");
	     System.out.println("4. Decimal to Binary");
	     System.out.println("5. Decimal to Oct");
	     System.out.println("6. Decimal to Hexa");
	     System.out.println("7. Binary to Oct");
	     System.out.println("8. Binary to Hexa");
	     System.out.println("9. Oct to Binary");
	     System.out.println("10. Oct to hexa");
	     System.out.println("11. Hexa to Binary");
	     System.out.println("12. Hexa to Oct");
	     System.out.print("Choose your option : ");
	     n=sc.nextInt();
	      switch(n){
		  case 1 : System.out.println("Enter a binary Number");
			   String bin=sc.next();
			   int dec=bintodec(bin);
			   System.out.println("Decimal value : "+dec);
			   break;

		   case 2 : System.out.println("Enter a Oct value ");
			    String oct=sc.next();
			    dec=octtodec(oct);
			    System.out.println("Decimal value" + dec);
			    break;

		   case 3 : System.out.println("Enter hexaDecimal value ");
			   String hd=sc.next();
			    dec=hdtodec(hd);
			    System.out.println("Decimal value" + dec);
			    break;

		   case 4 : System.out.println("Enter a decimal value ");
			    dec=sc.nextInt();
			    bin=dectobin(dec);
			    System.out.println("Binary value" +bin);
			    break;

		   case 5 : System.out.println("Enter a decimal value ");
			    dec=sc.nextInt();
			    oct=dectoOct(dec);
			    System.out.println("Oct value" +oct);
			    break;

		   case 6 : System.out.println("Enter a decimal value ");
			    dec=sc.nextInt();
			    hd=dectohd(dec);
			    System.out.println("Hexa decimal " +hd);
			    break;
		
		   case 7 : System.out.println("Enter Binary ");
			   bin=sc.next();
			   dec=bintodec(bin);
			   oct=dectoOct(dec);
			   System.out.println("Oct value " +oct);
			   break;

		  case 8 :System.out.println("Enter Binary ");
			   bin=sc.next();
			   dec=bintodec(bin);
			   hd=dectohd(dec);
			    System.out.println("Hexa decimal " +hd);
			    break;
		  case 9 :System.out.println("Enter Oct ");
			    oct=sc.next();
			    dec=octtodec(oct);
		   	    bin=dectobin(dec);
			    System.out.println("Binary value " +bin);
			    break;

		  case 10 :System.out.println("Enter Oct ");
			    oct=sc.next();
			    dec=octtodec(oct);
			    hd=dectohd(dec);
			    System.out.println("Hexadecimal " +hd);
			    break;

     		 case 11 : System.out.println("Enter hexaDecimal value ");
			    hd=sc.next();
			    dec=hdtodec(hd);
			    bin=dectobin(dec);
			    System.out.println("Binary value " +bin);
			    break;
    
   		 case 12 : System.out.println("Enter hexaDecimal value ");
			    hd=sc.next();
			    dec=hdtodec(hd);
			    oct=dectoOct(dec);
			    System.out.println("Oct value " +oct);
			    break;
			   
                default : System.out.println("Invalid"); 
		}
		
	     
	     }while(n>0 && n<=12);
	     System.out.println("Invalid Option \nThak you.....");

	}
}