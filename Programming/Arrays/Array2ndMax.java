import java.util.Scanner;
class Array2ndMax{
	
      public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of the arrays ");
	int n=sc.nextInt();
	
	int [] arr = new int[n];
	int max=0,max2=0,max3=0;
	for(int i=0;i<n;i++){
	   arr[i]=sc.nextInt(); 
  	   if(arr[i]>max){
	    max2=max;
	    max=arr[i];
 	   }
	   if(arr[i]>max2 && arr[i]!=max){
	      max2=arr[i];
	   }
	   if(arr[i]>max3 && arr[i]!=max && arr[i]!=max2){
	      max3=arr[i];
	   }
	}

	System.out.println("Max "+max);
	System.out.println("2nd Max "+max2);
	System.out.println("3rd Max "+max3);
	}
}
	