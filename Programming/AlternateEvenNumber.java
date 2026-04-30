package Programming;

import java.util.Scanner;

public class AlternateEvenNumber {   //Alternate even number in a given range 
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the range");
    int start = sc.nextInt();
    int end = sc.nextInt();
    
    if(start%2!=0){
        start++;
    }

   for(int i=start;i<=end; i+=4){
    System.out.print(i + " ");
   }
    sc.close();
}
}