package CoreJava.StaticMethods;
import java.util.Scanner;
public class Method2{
     static int m = 28; //static varibles must declare with the class only
          static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Method2 obj = new Method2();
        System.out.println(m);
        System.out.println("Enter a byte value");
        System.out.print(obj.m2((int)m1(sc.nextByte())));

    }
    static float m1(byte a){
     System.out.println(a);
     System.out.print("Enter a float value :");
     return sc.nextFloat();
    }
    short m2(int a){
    System.out.println(a);
    System.out.print("Enter a short value :");
    return sc.nextShort();
    }
}
