package Programming;
import java.util.Scanner;
public class NumberSiries {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a=sc.nextInt();
        int count=0;
        boolean first=true;
         if(a<0){
            for(int i=a;i<0;i++){
                count++;
            }
         }
         if(a<0){
            a=count;
         }
        for(int i=1;i<=a;i++){
            
            if(i%5==0 && i%2==1){
                System.out.print("divisible by five");
                first = false;
            }
            else if(i%2!=0){
                System.out.print(i);
                first=false;
        }
        if(!first && i%2!=0)
            {
                System.out.print(", ");
            }
    }
    sc.close();
    }

}
