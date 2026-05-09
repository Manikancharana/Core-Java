package CoreJava.Constructor;
import java.util.Scanner;
public class ParaCons {
    static Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();

    ParaCons(boolean a){
        System.out.println(a);
        System.out.println("Parametarized Constructor");
    }
    public static void main(String[] args){
        ParaCons x = new ParaCons(sc.nextBoolean());
        System.out.println(x.a);
    }
}
