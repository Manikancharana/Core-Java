package CoreJava.Constructor;
import java.util.Scanner;
public class Cons1 {
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int m1(int z){
        return z;
    }
   Cons1(){
    System.out.println("Hello mani... ");
   }

    public static void main(String[] args){
        Cons1 x = new Cons1();
        System.out.println(x.m1(5));
    }
}
