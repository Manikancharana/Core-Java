package Programming.Methods;
import java.util.Scanner;
class Non_Fibonacci{
    static void nonFib(int n){
        int a=0,b=1,c=0,n1=0;
        while (n>n1) {
            n1++;
            // System.out.print(a +"  ");
            if(a+1!=b){
                for(int j=a+1;j<b;j++){
                    System.out.print(j + "  ");
                }
            }
            c=a+b;
            a=b;
            b=c; 
        }
    }
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
nonFib(n);

}
}