import java.util.Scanner;
class Bank{
   private String UserName;
   private int Pin;
   private long phno;

   void setPin(int Pin){
       this.Pin=Pin; 
     }

   Long getphno(){
     return phno;
    }

   int getPin(){
    return Pin;	
    }
    Bank(String UseName , int Pin, long phno){
       this.UserName=UserName;
       this.Pin= Pin;
       this.phno=phno;
    }
 }

class Verification{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("Enter Username, Pin and Phone no : ");

     Bank obj = new Bank(sc.next() , sc.nextInt(),sc.nextLong());

     long ph=obj.getphno();
     System.out.print("Enter Old phone no : ");
     long no=sc.nextLong();
     if(ph==no){
     System.out.print("Enter new Pin : ");
     obj.setPin(sc.nextInt());
     System.out.print("Updated Pin  : ");
     System.out.println(obj.getPin());
     }
      else System.out.println("Enter valid ph no ");
}
}