package CoreJava.Oops.Inheritence;

import java.util.Scanner;

class Bank {
    double balence=10000;
    void withdraw(int amount){
        balence=balence-amount;
        System.out.println("Amount withdraw Successfully...");
        
    }
    void deposit(int amount){
        balence=balence+amount;
        System.out.println("Amount deposite Successfully...");
    }
    void balence_Enquiry(){
        System.out.println("Avilable balence is "+balence);
    }
}
public class User extends Bank{
    int amount;
    static User x = new User();
    void Display(int c, int amount){
       
       if(c==1) x.deposit(amount);
       if(c==2) x.withdraw(amount);
       if(c==3) x.balence_Enquiry();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        while (true) {
            System.out.println("Choose Options \n 1. Deposite amount \n 2. Withdraw amount \n 3.Balance Enquiry");
            int n=sc.nextInt();

            x.Display(n,sc.nextInt());
            System.out.println("Do you want to another transaction (0/1) ");
            int a=sc.nextInt();
            if(a==1){
                int b=sc.nextInt();
                x.Display(b,sc.nextInt());
            }else{
                return;
            }

        }
          
        }
    }
   