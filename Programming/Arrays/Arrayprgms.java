import java.util.Scanner;
class Arrayprgms{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array ");
	int n=sc.nextInt();
	int [] arr = new int[n];
	for(int i=0;i<n;i++){
	   arr[i]=sc.nextInt();
	}
	int sum=0;

	/*  To print array 
	for(int i=0;i<n;i++){
	   System.out.print(arr[i]);
	   if(i!=n-1) System.out.print("-->");
	}

	 // To print Sum of Odd Number in array

	
	for(int i=0;i<n;i++){
	   if(i%2==0){
		sum+=arr[i];
	    }
	}
	System.out.println("Sum of Odd Number "+sum);
	
	
	for(int i=0;i<n;i++){
	   sum+=arr[i];
	}
	System.out.printf("%.2f",(float) sum/n);  // To print Avg of array
	*/
	
	// First and last element
  	   System.out.println("First element "+arr[0] + "  Last element "+ arr[n-1]);	
	}
	}