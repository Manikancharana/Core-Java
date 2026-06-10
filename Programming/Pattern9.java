import java.util.Scanner;
public class Pattern9
{
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+""); //if add space then it is pyramid
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void pattern1(int n){  //left align
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    
    static void pattern2(int n){   //reverse left align 
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void pattern3(int n){
        for(int i=n;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void pattern4(int n){
        for(int i=)
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
// 		pattern(n);
// 		pattern1(n);
// 		pattern2(n);
// 		pattern3(n);
	}
}