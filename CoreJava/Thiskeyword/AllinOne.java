package CoreJava.Thiskeyword;
import java.util.Scanner;

public class AllinOne{
    static Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    void sum (int a,int b){
        System.out.println("Sum is : "+a+b);
        this.sum(sc.next()); // this at method level
    }
    int sum(String b){
        System.out.println("Hello, "+b);
        return 0;
    }
    AllinOne(){
        this(sc.nextFloat(),sc.nextInt());   // this at constructor level
        System.out.println("Default constructor...");
    }
    AllinOne(float a , int n){
        System.out.println(a+"   "+n);
        System.out.println("Instance variable "+ this.n);  // this at variable level
    }
  public static void main(String[] args){
      AllinOne x= new AllinOne();
      x.sum(sc.nextInt(),sc.nextInt());
  }
}