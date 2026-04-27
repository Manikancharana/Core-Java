// Create a Java application where we have one class which contains 2 static methods and 2 non static methods
//  having parameter and return type invoke the properties by providing dynamic inputs and implement 
//  method to method calling. Note Implement the methods alternatively like 
//  static method -> non static method -> static method -> non static method

package CoreJava.StaticMethods;

public class B {
     static B x = new B();
    public static int add(int a , int b){
        int sum = a+b;
        return sum;
    }

    int sub(int a, int b){
        System.out.println(add(a,b));
        int sub1 = a-b;
        return sub1;
    }

  public static int mult(int a,int b){
        System.out.println(x.sub(a,b));
        int mult1 = a*b;
        return mult1;
    }
    int div(int a, int b){
        System.out.println(mult(a,b));
        int div1 = a/b;
        return div1;
    }
    public static void main(String[] args){
        System.out.println("Enter two values ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
       
        System.out.println(x.div(a,b));
        sc.close();
    }

}
