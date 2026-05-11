package Programming.Methods;
import java.util.Scanner;
public class Factorial {

    static void fact(int n){
        int fact=1,sum=1;
        for(int i=1;i<=n;i++){
            fact*=i;
            System.out.print(fact + " ");
            sum+=fact;
        }
      System.out.println(" = "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
    }
}
