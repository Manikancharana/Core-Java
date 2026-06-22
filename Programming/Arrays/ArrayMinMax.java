import java.util.Scanner;
class ArrayMinMax{
	
      public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of the arrays ");
	int n=sc.nextInt();
	
	int [] arr = new int[n];

	for(int i=0;i<n;i++){
	   arr[i]=sc.nextInt();
	}
	int max=0,min=arr[1];
	for(int i=0;i<n;i++){
	    if(arr[i]>max) max=arr[i];
	    if(arr[i]<min) min=arr[i];
	}
	System.out.println("Biggest element in array "+max);
	System.out.println("Lowest element in array "+min);
}
}