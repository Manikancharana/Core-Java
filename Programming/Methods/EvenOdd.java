package Programming.Methods;

import java.util.Scanner;

/* 
public class EvenOdd {
    public static String isEven(int n){
        if(n%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
     System.out.println(isEven(n));
     sc.close();
    }
}

*/


/* 
// return value store in a variable And print variable
public class EvenOdd{
    public static String isEven(int n){
        if(n%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      String s =isEven(n);  
     System.out.println(s);
     sc.close();
    }
}

*/

//condition check in Main method


// public class EvenOdd{
//     public static boolean isEven(int n){
//          return n%2==0;
//     }
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int n = sc.nextInt();
//       if(isEven(n)){
//        System.out.println("Even");
//       }
//       else{
//         System.out.println("odd");
//       }
     
//      sc.close();
//     }
// }


// Terinary operator

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
         String s= (a%2==0)?"Even":"Odd";
         System.out.println(s);
    }
}

