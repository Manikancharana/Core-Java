import java.util.Scanner;
class GMail{
   private String UserName;
   private String Password;
   private long Phno;
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
   long getPhno(){
     return Phno;
    }
   String getMail(){
     return Gmail;
    }
   
    GMail(String UserName ,String Password,long Phno, String Gmail){
       this.UserName=UserName;
       this.Password= Password;
       this.Phno=Phno;
       this.Gmail=Gmail;
    }
 }
class User{
     GMail obj;
     static Scanner sc = new Scanner(System.in);
     User(GMail obj){
       this.obj=obj;
      }
           void login(){
           long Ph=obj.getPhno();
           String UserName=obj.getUserName();
           String Password=obj.getPassword();
           String Gmail=obj.getMail(); 
           System.out.println("Login..... \nEnter userName & Password");    
           if((UserName.equals(sc.next())) && (Password.equals(sc.next()))){
               System.out.println("Login Successfully");
            }
            else{
                System.out.println("Invalid Username or Password");
                System.out.println("If you want to try again, Enter 1 or reset Password Enter 2 or Exit enter any key");
                int n=sc.nextInt();
                if(n==1){
                   login();
                  }
                else if(n==2){
                        System.out.println("Enter Your Old Phone Number");
                        if(Ph==sc.nextLong()){
                           System.out.print("Enter new Password : ");
                           obj.setPassword(sc.next());
                          }
                      login();
                  }
                else{
                    System.out.println("Have a nice day");
                   } 
            }
                               
     }
} 

class ConstrtObjPara{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
     System.out.println("Enter Username, password, PhNumber and Mail Id : ");
     GMail obj = new GMail(sc.next(),sc.next(),sc.nextLong(),sc.next());
     User x = new User(obj);
     System.out.println("UserName : "+obj.getUserName());
     System.out.println("Passwors : "+obj.getPassword());
     System.out.println("Phone Number : "+obj.getPhno());
     System.out.println("EMail ID : "+obj.getMail());
     x.login();
    }
}