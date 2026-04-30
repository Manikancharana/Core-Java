package Programming;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float start = sc.nextFloat();
    float end = sc.nextFloat();
    boolean first = true;
    for(float i=start;i<end;i+=0.2f){
        if(!first){
            System.out.print(", ");
         }
         System.out.print(i+"^2");
         first = false;
    }
    System.out.print(".");
    sc.close();
}

}
