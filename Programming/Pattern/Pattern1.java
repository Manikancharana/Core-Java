// if end = 10 o/p is 5,6,10. or if n= 15 o/p is 5,6,10,12,15  
// logic 5 multiples and multiple next even number 

package Programming;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
         int end = sc.nextInt();
         boolean b = false;
         for(int i=5;i<=end; i++){
            if(i%5==0){   // checking 5 multiple or not
                System.out.print(i+", ");
                b=true;
            }
            else if(b && i%2==0){  // checking both 5 mutliple and even or not 
                System.out.print(i+", ");
                b= false;
            }
         }
         sc.close();
    }
}