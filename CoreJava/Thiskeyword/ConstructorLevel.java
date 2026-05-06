package CoreJava.Thiskeyword;

import java.util.Scanner;

public class ConstructorLevel {
    static Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
    ConstructorLevel(){
        System.out.println("Hello world");
    }
    ConstructorLevel(int a , int b){
        this();
        int sum =a+b;
        System.out.println(sum);
        System.out.println("Non static value "+n);
    }
    public static void main(String[] args){
      ConstructorLevel c1 = new ConstructorLevel(sc.nextInt(),sc.nextInt());

    }
}