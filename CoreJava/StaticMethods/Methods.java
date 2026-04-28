package CoreJava.StaticMethods;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        Methods obj = new Methods();
        System.out.print(obj.m2(obj.m1(a)));
        sc.close();
    }
    int m1(int a){
     System.out.println(a);
     return a;
    }
    boolean m2(int a){
    System.out.println(a);
    return true;
    }
}
