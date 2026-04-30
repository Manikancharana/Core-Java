package CoreJava.Constructor;

import java.util.Scanner;
   
public class MultiParaCons2 {
    static Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    MultiParaCons2(){
        System.out.println("Default constructor...");
        new MultiParaCons2(sc.nextInt());
        
    }
    MultiParaCons2(int a){
        System.out.println(a);
       new MultiParaCons2(sc.nextInt(),sc.next());
    }
    MultiParaCons2(int a, String b){
        System.out.println(a+"\t"+b);
      new MultiParaCons2(sc.nextInt(),sc.next(),sc.next().charAt(0));
    }
    MultiParaCons2(int a, String b, char c){
        System.out.println(a+"\n"+b+"\n"+c);
    }

    public static void main(String[] args) {
        MultiParaCons2 x = new MultiParaCons2();
        System.out.println(x.a);

    }

}
