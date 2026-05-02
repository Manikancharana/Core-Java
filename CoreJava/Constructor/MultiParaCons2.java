package CoreJava.Constructor;

import java.util.Scanner;
   
public class MultiParaCons2 {
    static Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  //allocate memory and print all constructors

    MultiParaCons2(){  //this keyword will more preority than non static varialbe
        this(sc.nextInt());  //1st input 
        System.out.println("Default constructor...");        
    }
    MultiParaCons2(int a){
        this(sc.nextInt(),sc.next()); //take 2nd input int,string
        System.out.println(a);
       
    }
    MultiParaCons2(int a, String b){
        this(sc.nextInt(),sc.next(),sc.next().charAt(0));  // 3rd input 
        System.out.println(a+"\t"+b);
    }
    MultiParaCons2(int a, String b, char c){ // ofter 3rd input it goes to non static variable memory elacation
        System.out.println(a+"\n"+b+"\n"+c);
    }

    public static void main(String[] args) {
        MultiParaCons2 x = new MultiParaCons2();
        System.out.println(x.a);

    }

}
