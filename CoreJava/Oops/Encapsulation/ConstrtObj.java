import java.util.Scanner;
class Insta{
   private String UserName;
   private String Password;

   void setUserName(String UserName){
      this.UserName=UserName;
    }
   void setPassword(String Password){
      this.Password=Password; 
     }
   void setboth(String UserName , String Password ){
      this.UserName=UserName;
      this.Password=Password;
     }

   String getUserName(){
     return UserName;
    }
   String getPassword(){
    return Password;	
    }
   
    Insta(String UserName , String Password){
       this.UserName=UserName;
       this.Password= Password;
    }
 }

class ConstrtObj{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
     System.out.print("Enter username and password : ");
     Insta obj = new Insta(sc.next(),sc.next());
     System.out.println(obj.getUserName());
     System.out.println(obj.getPassword());
     
     System.out.println("Enter 1.Change user name or 2. change Password or 3. Change both ");
     int n=sc.nextInt();
     if(n==1){
     System.out.print("Enter new UserName : ");
     obj.setUserName(sc.next());
     System.out.print("Updated UserName : ");
     System.out.println(obj.getUserName());
     }
     else if(n==2){ 
     System.out.println("Enter new Password : ");
     obj.setPassword(sc.next());
     System.out.print("Updated Password  : ");
     System.out.println(obj.getPassword());
     }
     else if(n==3){
      System.out.println("Enter new UserName & Password : ");
     obj.setboth(sc.next(),sc.next());
     System.out.print("Updated Username and Password  : ");
     System.out.println(obj.getUserName());
     System.out.println(obj.getPassword());
     }
     else System.out.println("Enter valid number ");
   }
}