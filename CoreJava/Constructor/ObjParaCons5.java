package CoreJava.Constructor;
import java.util.Scanner;

public class ObjParaCons5 {
       static Scanner sc = new Scanner(System.in);
       String mblName;
       String mblBrand;
       float version;
       int ram;
    ObjParaCons5(String mblName, String mblBrand , float version , int ram){  //assign values using this 
       this.mblName=mblName;
        this.mblBrand=mblBrand;
        this.version =version;
        this.ram=ram;
    }
    ObjParaCons5(ObjParaCons5 m){
       mblName= m.mblName;
       mblBrand = m.mblBrand;
       version= m.version;
       ram = m.ram;
    }
    public static void main(String[] args){
        ObjParaCons5 x = new ObjParaCons5(sc.nextLine(),sc.next(),sc.nextFloat(),sc.nextInt());
        ObjParaCons5 x1= new ObjParaCons5(x);

        System.out.println("Original values");
        System.out.println(x.mblName+ "  "+ x.mblBrand + "  "+ x.version +"  "+ x.ram);
        System.out.println("Copied values");
        System.out.println(x1.mblName+ "  "+ x1.mblBrand + "  "+ x1.version +"  "+ x1.ram);
    }
}
