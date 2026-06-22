import java.util.Scanner;
class ArraySum{
	
      public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of  2 arrays ");
	int n=sc.nextInt();
	int n1=sc.nextInt();
	int c=0;
	if(n>n1) c=n;
	else c=n1;
	int [] arr = new int[n];
	int [] arr1 = new int[n1];

	for(int i=0;i<n;i++){
	   arr[i]=sc.nextInt();
	}
	System.out.println("Enter 2nd array elements");
	for(int i=0;i<n1;i++){
	   arr1[i]=sc.nextInt();
	}
	
 	for(int i=0;i<c;i++){
	    int sum=0;
	    if(i<n && i<n1)
	    sum+=arr[i]+arr1[i];
	    else if(i<n) sum=arr[i];
 	    else sum=arr1[i];
	    System.out.print(sum +" ");
	}
	}
	}