package Programming;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter range ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            System.out.print(i+"*"+(i+1) +", ");
        }
        System.out.println(" ");
        for(int i=a;i<=b;i++){
            System.out.print(i*(i+1) + ", ");
        }

    }
}
