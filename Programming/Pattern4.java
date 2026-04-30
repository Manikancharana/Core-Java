package Programming;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter range ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean first=true;
        for(int i=a;i<=b;i++){
            if(!first){
                System.out.print(",");
            }
            System.out.print(i+"*"+(i+1));
            first=false;
        }
        System.out.println(" ");
        first=true;
        for(int i=a;i<=b;i++){
            if(!first){
                System.out.print(",");
            }
            System.out.print(i*(i+1));
            first=false;
        }

    }
}
