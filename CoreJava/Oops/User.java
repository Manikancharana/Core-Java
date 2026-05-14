package CoreJava.Oops;

import java.util.Scanner;

class Bank {
    double balence=10000;
    void withdraw(int amount){
        if(balence>amount){
        balence=balence-amount;
        System.out.println("Amount withdraw Successfully...");
        }
        else System.out.println("Insufficient balence");
        
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
   static   Scanner sc= new Scanner(System.in);
    static int amount;
    static User x = new User();
    void display(int c){
       
       if(c==1){
        System.out.print("Enter amount ");
        amount=sc.nextInt();
        x.deposit(amount);
       }
       if(c==2){
        System.out.print("Enter amount ");
        amount=sc.nextInt();
         x.withdraw(amount);
       }
       
       if(c==3) x.balence_Enquiry();
    }
    void view(){
        System.out.println("Choose Options \n 1. Deposite amount \n 2. Withdraw amount \n 3.Balance Enquiry");
            int n=sc.nextInt();
            display(n);
    }
    public static void main(String[] args){
        int n=1;
        while (n==1) {
            x.view();
            System.out.println("Do you want to another transaction (1/0) ");
            int a=sc.nextInt();
            if(a==1){
                n=1;
            }else{
                n=0;
            }
        }  
        }
    }
   