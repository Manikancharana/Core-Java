// Create a Java application where we have one class which contains one non static method 
// like add having 2 int parameters it has to return the addition of parameters, 1 non static method like 
// sub having 2 int parameters it has to return subtraction of parameters, we also another non static method like 
// multi having no parameter it has to return multiplication of both add and sub methods results, 
// invoke the properties according to the requirement.

package CoreJava.StaticMethods;
import java.util.Scanner;
public class A {
    Scanner sc = new Scanner(System.in);
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    int mult(){
        int a =add(sc.nextInt(),sc.nextInt());
        int b =sub(sc.nextInt(),sc.nextInt());
        return a*b;
    }
    public static void main(String[] args){
        A x= new A();
        System.out.println("Enter two numbers ");
        System.out.println(x.mult());
    }
}
