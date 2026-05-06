package CoreJava.Thiskeyword;
import java.util.Scanner;

public class VarLevel {
    static Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
     void var(long n){
        System.out.println("Local var is " + n);
        System.out.println("Instance var is " + this.n);
     }
    public static void main(String[] args){
        VarLevel obj = new VarLevel();
        long n = sc.nextInt();
        obj.var(n);
    }
}
