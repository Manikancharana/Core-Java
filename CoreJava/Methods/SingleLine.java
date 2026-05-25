package CoreJava.Methods;
import java.util.Scanner;

class SingleLine{
   static Scanner sc = new Scanner(System.in);
       static SingleLine m1(){
 	  return new SingleLine(); 
      	}
       static SingleLine m2(){
          return new SingleLine();
	}
       boolean m3(){
	return sc.nextBoolean();
       }
	String m4(){
	 return sc.next();
	}
       static void m5(boolean a , String s){
	System.out.println(a + "  "+s);
	}
   public static void main(String[] args){
              m5(m1().m3(),m2().m4());
	}
    }