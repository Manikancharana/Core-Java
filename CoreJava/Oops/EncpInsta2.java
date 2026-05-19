import java.util.Scanner;
class Insta{
private String UserName="ManiKancharana";
private String Password = "Mani@1234";

void setUserName(String userName){
this.UserName=userName;
}
void setPassword(String Password){
this.Password=Password; 
}

void setBoth(String UserName, String Password){
this.UserName=UserName;
this.Password=Password;
}

String getUserName(){
return UserName;
}
String getPassword(){
return Password;
}
}
class EncpInsta2{
static Scanner sc = new Scanner(System.in);
public static void main(String[] args){
Insta obj = new Insta();
System.out.println("Default Values : ");
System.out.println(obj.getUserName());
System.out.println(obj.getPassword());

System.out.print("Enter new userName : ");
obj.setUserName(sc.next());
System.out.print("Updated userName : ");
System.out.println(obj.getUserName());

System.out.println("Enter new Password : ");
obj.setPassword(sc.next());
System.out.print("Updated Password  : ");
System.out.println(obj.getPassword());

System.out.println("Enter Both new UserName and Password : ");
obj.setBoth(sc.next(),sc.next());
System.out.println("Updated UserName & Password : ");
System.out.println(obj.getUserName());
System.out.println(obj.getPassword());
}
}