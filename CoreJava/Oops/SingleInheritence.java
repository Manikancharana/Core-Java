package CoreJava.Oops.Inheritence;

public class SingleInheritence {
    int a=100;
       static void display(){
      System.out.println("Hello, ");
}
}
class person extends SingleInheritence{
 void welcome(){
    System.out.println("Hii, Mani");
 }
public static void main(String[] args){
      person obj = new person();
      display();
      obj.welcome();
      System.out.println("Number from parent class "+obj.a);

    }

}
