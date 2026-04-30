package Programming;
import java.util.Scanner;
public class NumberSiries {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a=sc.nextInt();
        int count=0;
         if(a<0){
            for(int i=a;i<0;i++){
                count++;
            }
         }
         if(a<0){
            a=count;
         }
        for(int i=1;i<=a;i++){
            if(i%5==0){
                System.out.print("divisible by five, ");
            }
            else{
                System.out.print(i+", ");
        }
    }
    System.out.print(count);
    sc.close();
    }

}
