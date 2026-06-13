import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j<i){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
    }
}


// import java.util.Scanner;
// public class Pattern6
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int n=sc.nextInt();
// 		for(int i=1;i<=n;i++){
// 		    for(int j=1;j<=n;j++){
// 		        if(i<j)
// 		        System.out.print("2");
// 		        else if(i==j) 
// 		        System.out.print("1");
// 		        else 
// 		        System.out.print("0");
// 		    }
// 		    System.out.println();
// 		}
// 	}
// }
