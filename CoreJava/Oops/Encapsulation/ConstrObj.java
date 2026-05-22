import java.util.Scanner;
class Bank{
   private String UserName;
   private int Pin;

   void setUserName(String userName){
      this.UserName=userName;
    }
   void setPin(int Pin){
       this.Pin=Pin; 
     }

   String getUserName(){
     return UserName;
    }
   int getPin(){
    return Pin;	
    }
    Bank(String UseName , int Pin){
       this.UserName=UserName;
       this.Pin= Pin;
    }
 }

class ConstrObj{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
     Bank obj = new Bank(sc.next() , sc.nextInt());
     System.out.println(obj.getUserName());
     System.out.println(obj.getPin());

     System.out.print("Enter new userName : ");
     obj.setUserName(sc.next());
     System.out.print("Updated userName : ");
     System.out.println(obj.getUserName());

     System.out.println("Enter new Pin : ");
     obj.setPin(sc.nextInt());
     System.out.print("Updated Pin  : ");
     System.out.println(obj.getPin());
   }
}