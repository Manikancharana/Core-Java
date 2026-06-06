import java.util.Scanner;
public class Pattern7
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,h=0;
		for(int i=0;i<=n;i++){
		    if(i%2==1){
		        c=h+1;
		        for(int j=1;j<=i;j++){
		            System.out.print(c);
		            h++;c++;
		            if(j<i){
		                System.out.print("*");
		            }
		            
		        }
		    }
		    else{
		        c=h+i;
		        for(int j=1;j<=i;j++){
		            
		            System.out.print(c);
		            c--;h++;
		            if(j<i){
		                System.out.print("*");
		            }
		        }
		    }
		    System.out.println();
		}
	}
}