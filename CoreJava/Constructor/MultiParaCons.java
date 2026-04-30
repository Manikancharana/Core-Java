package CoreJava.Constructor;

import java.util.Scanner;
   
public class MultiParaCons {
    static Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    MultiParaCons(){
        System.out.println("Default constructor...");
    }
    MultiParaCons(int a){
        System.out.println(a);

    }
    MultiParaCons(int a, String b){
        System.out.println(a+"\t"+b);
    }
    MultiParaCons(int a, String b, char c){
        System.out.println(a+"\n"+b+"\n"+c);
    }

    public static void main(String[] args) {
        MultiParaCons x = new MultiParaCons();
        System.out.println(x.a);
        new MultiParaCons(sc.nextInt());
        new MultiParaCons(sc.nextInt(),sc.next());
        new MultiParaCons(sc.nextInt(),sc.next(),sc.next().charAt(0));

    }

}
