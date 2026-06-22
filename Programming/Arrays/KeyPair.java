import java.util.Scanner;
class KeyPair{
	
      public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array ");
	int n=sc.nextInt();
	System.out.println("Enter key value");
	int key=sc.nextInt();
	int [] arr = new int[n];
	for(int i=0;i<n;i++){
	   arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
	    for(int j=i+1;j<n;j++){
		if(arr[i]+arr[j]==key){
			System.out.print("("+arr[i] +","+arr[j] +") ");
		}
	     }
	}
	}
	}