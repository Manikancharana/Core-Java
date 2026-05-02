package CoreJava.Methods;
import java.util.Scanner;
public class Method1 {
   static Scanner sc = new Scanner(System.in);
   static Method1 x = new Method1();
    int a=sc.nextInt();
    int b = sc.nextInt(); 
    int c = sc.nextInt();
    void met(float a, boolean t){
    System.out.println(a+" "+ b+" " +c+" ");
    System.out.print(a+"  "+ t);
    }

    static boolean met2(String s){
        System.out.print(x.a+" "+ x.b+" " +x.c+" ");
 System.out.print(s);
       return true;
    }
    public static void main(String[] args){
      x.met(sc.nextFloat(),sc.nextBoolean());
      met2(sc.next());
    }
}
