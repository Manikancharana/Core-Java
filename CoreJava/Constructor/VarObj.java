package CoreJava.Constructor;
import java.util.Scanner;

    /* 

public class VarObj {
    static Scanner sc = new Scanner(System.in);
    int a,b,c;
    VarObj(int m,int n, int o){
        a=m;
        b=n;
        c=o;
        System.out.println("Parametarized constructor");
       
    }
    public static void main(String[] args){
        VarObj x = new VarObj(sc.nextInt(),sc.nextInt(),sc.nextInt());
           System.out.println(x.a+"\n"+x.b+"\n"+x.c);
           sc.close();
    }
        */


public class VarObj {
    static Scanner sc = new Scanner(System.in);
    int a,b,c;
    VarObj(int a,int b, int c){  // use of this keyword
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void main(String[] args){
        VarObj x = new VarObj(sc.nextInt(),sc.nextInt(),sc.nextInt());
           System.out.println(x.a+"\n"+x.b+"\n"+x.c);
           sc.close();
    }
}
