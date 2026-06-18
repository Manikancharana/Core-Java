import java.util.Scanner;
class A{
	static class B{
	    static void m1(){
		System.out.println("Method m1");
	    }
	    void m2(){
		System.out.println("Method m2 ");
	    }
	    class C{
	       void m3(){
	           System.out.println("Method m3 ");
	       }
	       class D{
		   void m4(){
  			System.out.println("Method m4");
  	      	   class E{
			void m5(){
			    System.out.println("Method m5");
			   }
		        }
			E x= new E();
			x.m5();
		}
	       }
	    }
 	}
      }
class Test1{
	public static void main(String[]  args){
		A.B x1 = new A.B();
		x1.m1();
		x1.m2();
		A.B.C x2 = x1.new C();
		x2.m3();
		A.B.C.D x3 = x2.new D();
		x3.m4();
	}
     }
	