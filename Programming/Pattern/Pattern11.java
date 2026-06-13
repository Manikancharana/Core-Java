import java.util.Scanner;
class Pattern11{
	public static void main(String [] args){
	Scanner sc=  new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
	    int h=i;
	    int c = 2 * (n - i) + 1;
            int m = 2 * i - 1;
		for(int j=1;j<=n;j++){

		    System.out.print(h+" ");
	
		    if(j%2==1){
			h+=c;
			}
		    else
			{
			h+=m;
			}
		}
		System.out.println();
		
	}
	}
}


/*
import java.util.Scanner;
class pattern11{
	public static void main(String [] args){
	Scanner sc=  new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
		int c=n*2-1,h=i;
		for(int j=1;j<=n;j++){
		    if(j==1) System.out.print(h+" ");
		    else if(j%2==1){
			h+=1;
			System.out.print(h+" ");
			}
		    else if(j%2==0)
			{
			h+=c;
			System.out.print(h+" ");
			}
		}
		c-=2;

	}
	}
}
*/