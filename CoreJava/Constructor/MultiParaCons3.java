package CoreJava.Constructor;

import java.util.Scanner;

public class MultiParaCons3 {
    static Scanner sc= new Scanner(System.in);
     
    static int m1(int a){
       System.out.print(a);
       return sc.nextByte();
    }
    long m2 (float a){
        System.out.print(a);
        return sc.nextLong();
    }
    int m3 (byte a){
        System.out.print(a);
        return sc.nextInt();
    }

    MultiParaCons3(){
        System.out.println(m1(sc.nextInt()));
    }
    

    public static void main(String[] args) {
        new MultiParaCons3();
        // new MultiParaCons3(sc.next());
        // new MultiParaCons3(sc.nextInt(),sc.next().charAt(0));

    }
}
