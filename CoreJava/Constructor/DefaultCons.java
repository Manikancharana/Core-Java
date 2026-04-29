package CoreJava.Constructor;
import java.util.Scanner;
public class DefaultCons {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
   DefaultCons(){
    System.out.print(a);
    System.out.print("  Hello mani...");

   }
    public static void main(String[] args) {
         DefaultCons x = new DefaultCons();
    }
}
