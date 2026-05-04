package CoreJava.Constructor;
 import java.util.Scanner;
public class ObjParaCons {
   static Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       ObjParaCons(ObjParaCons obj){
        System.out.println(n + " ");  
        System.out.println(obj.n + " "); // Disply 1st object valuex
       }
       ObjParaCons(){
        System.out.println("Default constructor");
       }
    public static void main(String[] args){
        
        ObjParaCons x= new ObjParaCons();
        ObjParaCons x1 = new ObjParaCons(x);
        System.out.println(x.n + " " + x1.n);
    }
}
