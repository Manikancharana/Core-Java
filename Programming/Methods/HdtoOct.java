import java.util.Scanner;
class HdtoOct{
	static String hdtoOct(String hd){
		int dec=0,p=0,k=0;
		if(hd.charAt(0)=='-') k=1;
		for(int i=hd.length()-1;i>=k;i--){
		    char ch=hd.charAt(i);
	            if(ch<='9'){
                       dec+=(ch-48)*Math.pow(16,p++);
                     }
		    else if(ch>='A' && ch<='F'){
                        dec+=(ch-55)*Math.pow(16,p++);
		     }
		    else if(ch>='a' && ch<='f'){
			dec+=(ch-87)*Math.pow(16,p++);
		     }
                    else{
			p=-1; break;
		     }		
		}
             String oct="";
             if(p==-1)   return "Invalid Input";
	     while(dec>0){
		int r=dec%8;
		dec/=8;
		oct=r+oct;
	     }
             return oct;
       }
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String hd=sc.next();
		System.out.println(hdtoOct(hd));
	}
}