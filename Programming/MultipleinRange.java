package Programming;
import java.util.Scanner;
public class MultipleinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range : ");
        int start =sc.nextInt();
        int end = sc.nextInt();
        if(end<start){
            System.out.println("INVALID RANGE");
        }
        int count =0;
        for(int i=start;i<=end;i++){
            if(i%11==0){
                System.out.print(i+ ", ");
                count++;
            }
        }
       if(count==0){
        System.out.println("NO NUMBER");
       }

        sc.close();
    }
}
