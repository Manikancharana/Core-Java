package CoreJava.Thiskeyword;

import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    float attendece=sc.nextFloat();
    String corejava(float attendece){
        
        if(attendece>=this.attendece){
        return "Good boy keep it up";
        }else{
            return "Better luck next time";
        }
    }
    public static void main(String[] args){
        Student x= new Student();
        System.out.print(x.corejava(sc.nextFloat()));v 
    }
}
