package CoreJava.Constructor;

import java.util.Scanner;

public class Cons3 {
    static Scanner sc = new Scanner(System.in);
    static int m1 (int a){
        return a;
    }
    String m2(int a){
        System.out.println(a);
        return sc.next();
    }
    Cons3(){
        
       System.out.print(m2(m1(sc.nextInt()))); 
     
    }
    public static void main(String[] args){
        Cons3 x = new Cons3();
    }
}
