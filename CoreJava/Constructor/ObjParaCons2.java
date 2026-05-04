package CoreJava.Constructor;
 import java.util.Scanner;
public class ObjParaCons2 {
    int a;
    float b ;
   static Scanner sc = new Scanner(System.in);
       ObjParaCons2(ObjParaCons2 obj){
        System.out.println(a + "  "+ b);  
        System.out.println(obj.a + " " + obj.b);
       }
       ObjParaCons2(int c,float d){
        a=c;
        b=d;
       }
    public static void main(String[] args){
        
        ObjParaCons2 x= new ObjParaCons2(sc.nextInt(),sc.nextFloat());
        ObjParaCons2 x1 = new ObjParaCons2(x);
         System.out.println(x.a + "  "+ x.b);  
        System.out.println(x1.a + " " + x1.b);
    }
}
