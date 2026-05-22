import java.util.Scanner;
class Insta{
   private String UserName;
   private String Password;
   private String Phno;
   private String Gmail;

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
   String getPhno(){
     return Phno;
    }
   String getMail(){
     return Gmail;
    }
   
    Insta(String UserName ,String Password,String Phno, String Gmail){
       this.UserName=UserName;
       this.Password= Password;
       this.Phno=Phno;
       this.Gmail=Gmail;
    }
 }

class ConstrtObj1{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
     System.out.print("Enter Username, password, PhNumber and Mail Id : ");
     Insta obj = new Insta(sc.next(),sc.next(),sc.next(),sc.next());
     System.out.println(obj.getUserName());
     System.out.println(obj.getPassword());
     System.out.println(obj.getPhno());
     System.out.println(obj.getMail());
     String p=obj.getPhno();
     String m=obj.getMail();
     
     System.out.println("Enter 1.Change user name or 2. change Password or 3. Change both ");
     int n=sc.nextInt();
     if(n==1){
      System.out.println("Enter old PhNumber ");
      if(p.equals(sc.next())){
        System.out.print("Enter new UserName : ");
        obj.setUserName(sc.next());
        System.out.print("Updated UserName : ");
        System.out.println(obj.getUserName());
           }
       else System.out.println("Invalid PhNumber"); 
        }
     else if(n==2){ 
       System.out.print("Enter old mail ID : ");
        if(m.equals(sc.next())){
          System.out.println("Enter new Password : ");
          obj.setPassword(sc.next());
          System.out.print("Updated Password  : ");
          System.out.println(obj.getPassword()); 
        }
       else System.out.println("Invalid Mail ID ");
     }
     else if(n==3){
      System.out.print("Enter both old PhNumber & mail ID : ");
      if(p.equals(sc.next())&& m.equals(sc.next())){
          System.out.println("Enter new UserName & Password : ");
          obj.setboth(sc.next(),sc.next());
          System.out.print("Updated Username and Password  : ");
          System.out.println(obj.getUserName());
          System.out.println(obj.getPassword());
         }
      else System.out.println("Invalid PhNumber or Mail Id");
     }
     else System.out.println("Enter valid number ");
   }
}