import java.util.Scanner;
interface Interface{
    static Scanner sc=new Scanner(System.in);
    int m1(String x);
    default void m2(){
       System.out.println("m2 defined inside interface");
    }
    interface I2{
         int m3(float y);
    };
    Interface nx=new Interface(){
        public int m1(String x){
              System.out.println("m1 inside anonymous class");
              return sc.nextInt();
        }
    };
      Interface.I2 nx1=new Interface.I2(){
        public int m3(float y){
             System.out.println("m3 inside anonymous");
             return sc.nextInt();
        }
    };
    public static void main(String[] args){
         System.out.println(nx.m1(sc.next()));
         System.out.println(nx1.m3(sc.nextFloat()));
         nx.m2();
    }
}