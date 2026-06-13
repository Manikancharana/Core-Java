import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
		int c=i;
            for(int j=1;j<=n;j++){
		
                if(j==1){
                    System.out.print(i +" ");
                }else{
			c+=5;
			if(c<10) System.out.print("  ");
			else System.out.print(" ");
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }
    }
}
