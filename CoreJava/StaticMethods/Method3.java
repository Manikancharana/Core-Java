// package CoreJava.StaticMethods;
// import java.util.Scanner;
// public class Method3 {
//     static Scanner sc = new Scanner(System.in);

//     public static void main(String[] args) {
//         Method3 x = new Method3();
//        System.out.println("Enter short value : ");
//         System.out.print(x.m4(x.m2(m3(m1(sc.nextShort())))));
        
//     }

//    static boolean m1(short a){
//     System.out.println(a);
//     System.out.println("Enter boolean value : ");
//     return sc.nextBoolean();
//     }

//     long m2 (float a){
//         System.out.println(a);
//         System.out.println("Enter long value : ");
//         return sc.nextLong();
//     }

//     static float m3(boolean a){
//         System.out.println(a);
//         System.out.println("Enter float value : ");
//         return sc.nextFloat();
//     }
//     char m4 (long a ){
//         System.out.println(a);
//         System.out.println("Enter char value : ");
//         return sc.next().charAt(0);
//     }
   
// }



package CoreJava.StaticMethods;
import java.util.Scanner;
public class Method3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Method3 x = new Method3();
       System.out.println("Enter Float value : ");
        System.out.print(x.m4((int)x.m2(m3((int)m1(sc.nextFloat())))));
        
    }

   static float m1(float a){
    System.out.println(a);
    return a;
    }

    long m2 (float a){
        System.out.println(a);
        System.out.println("Enter long value : ");
        return sc.nextLong();
    }

    static float m3( int a){
        System.out.println(a);
        System.out.println("Enter int value : ");
        return sc.nextInt();
    }
    char m4 (int a ){
        System.out.println(a);
        System.out.println("Enter char value : ");
        return sc.next().charAt(0);
    }
   
}
