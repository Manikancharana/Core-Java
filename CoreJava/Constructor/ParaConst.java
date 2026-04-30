package CoreJava.Constructor;
import java.util.Scanner;
public class ParaConst {
    static Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();

    ParaConst(boolean a){
        System.out.println(a);
        System.out.println("Parametarized Constructor");
    }
    public static void main(String[] args){
        ParaConst x = new ParaConst(sc.nextBoolean());
        System.out.println(x.a);
    }
}
