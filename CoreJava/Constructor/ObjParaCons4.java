package CoreJava.Constructor;
import java.util.Scanner;

public class ObjParaCons4 {
       static Scanner sc = new Scanner(System.in);
       String mblName;
       String mblBrand;
       float version;
       int ram;
    ObjParaCons4(String a, String b , float c , int d){
        mblName=a;
        mblBrand=b;
        version =c;
        ram=d;
    }
    ObjParaCons4(ObjParaCons4 m){
       mblName= m.mblName;
       mblBrand = m.mblBrand;
       version= m.version;
       ram = m.ram;
    }
    public static void main(String[] args){
        ObjParaCons4 x = new ObjParaCons4(sc.nextLine(),sc.next(),sc.nextFloat(),sc.nextInt());
        ObjParaCons4 x1= new ObjParaCons4(x);

        System.out.println("Original values");
        System.out.println(x.mblName+ "  "+ x.mblBrand + "  "+ x.version +"  "+ x.ram);
        System.out.println("Copied values");
        System.out.println(x1.mblName+ "  "+ x1.mblBrand + "  "+ x1.version +"  "+ x1.ram);
    }
}
