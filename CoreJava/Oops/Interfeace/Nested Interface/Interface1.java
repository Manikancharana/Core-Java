import java.util.Scanner;
interface Interface{
    int m1(String x);
    interface I2{
         int m2(float y);
    };
   }
     abstract class Anonymous3{
	Scanner sc = new Scanner(System.in);

	abstract int m3(String a);
	
	int m4(int a){
	System.out.println("Hello i'm m3 "+a);
	return sc.nextInt();
	}
	Anonymous3(int a){
	  System.out.println("Constructor "+a);
	}
}
	
	
class Interface1{
	static Scanner sc = new Scanner(System.in);
	static Anonymous3 x = new Anonymous3(sc.nextInt()){
	int m3(String a){
	System.out.println("Hello i'm m1 "+a);
	return sc.nextInt();
	}

	};
	static Interface x1= new Interface(){
	   public int m1(String a){
	   System.out.println("Hello i'm m1 "+a);
	   return sc.nextInt();
	    }
	};
	static Interface.I2 x2= new Interface.I2(){
	  public int m2(float a){
	   System.out.println("Hello i'm m1 "+a);
	   return sc.nextInt();
	    }
	};
		
		public static void main(String[]  args){
		System.out.println(x.m3(sc.next()));
		System.out.println(x1.m1(sc.next()));
		System.out.println(x2.m2(sc.nextFloat()));
		System.out.println(x.m4(sc.nextInt()));

		}
	}











