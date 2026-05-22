package CoreJava.Oops;
import java.util.*;
public class Multilevel1 {
    static Scanner sc=  new Scanner(System.in);
    int Ram=sc.nextInt();
    int Rom=sc.nextInt();
    String Os_name=sc.next();
    float version= sc.nextFloat();
    String camera =sc.next();
    String Processor=sc.next();
    String battery =sc.next();
    String display=sc.next();
    double price=sc.nextDouble();
}

class WholeSaleMarket extends Multilevel1{
  double wprice=price+(price*0.1);
}
class Retailmarket extends WholeSaleMarket{
    double rprice =price+(price*0.2);
}
class Customer extends Retailmarket{
    void display(){
        System.out.println("Ram : "+Ram);
        System.out.println("Rom : "+Rom);
        System.out.println("Os name  : "+Os_name);
        System.out.println("version : "+version);
        System.out.println("Processor : "+version);
        System.out.println("battery : "+battery);
        System.out.println("Display : "+display);
        System.out.println("price  : "+rprice);
    }
    public static void main(String[] args) {
        Customer x = new Customer();
        x.display();
    }
}

