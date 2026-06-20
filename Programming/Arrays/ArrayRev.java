import java.util.Scanner;
class ArrayRev{	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array ");
	int n=sc.nextInt();
	int [] arr = new int[n];
	int [] temp = new int[n];
	for(int i=0;i<n;i++){
	   arr[i]=sc.nextInt();
	}

	for(int i=0;i<n;i++){
	   temp[n-i-1]=arr[i];
	 }

	for(int i=0;i<n;i++){	
	    System.out.print(temp[i]);
	  }
	
	}
	}