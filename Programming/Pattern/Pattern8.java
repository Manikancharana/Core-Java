import java.util.Scanner;
class Pattern8{
    public static void main(String [] args){                //prime pattern using isprime method
    Scanner  sc = new Scanner(System.in);
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
        int p=1;
        for(int j=1;j<=i;j++){
        while(!isprime(++p));
        System.out.print(p + " ");
    }
    System.out.println();
}
    }
    static boolean isprime(int n){
        int fc=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                fc++;
            }
        }
        return (fc==0 && n>1);
    }
}


// import java.util.Scanner;                         
// class Pattern8{
//     public static void main(String [] args){
//     Scanner  sc = new Scanner(System.in);                          //prime pattern using Nprimes
//     int n=sc.nextInt();
    
//     for(int i=1;i<=n;i++){
//         nprime(i);
//     System.out.println();
// }
//     }
//     static void nprime(int n){
//         int c=0;
//         for(int i=2;c<n;i++){
//             if(isprime(i)){
//                 System.out.print(i+" ");
//                 c++;
//             }
//         }
//     }
//     static boolean isprime(int n){
//         int fc=0;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 fc++;
//             }
//         }
//         return (fc==0 && n>1);
//     }
// }


// import java.util.Scanner;    
// class Main{
//     public static void main(String [] args){                   //prime pattern using condition and isprime
//     Scanner  sc = new Scanner(System.in);
//     int n=sc.nextInt();
    
//     for(int i=1;i<=n;i++){
//         int p=1;
//         for(int j=1;j<=i;){
//             if(isprime(++p)){
//                 System.out.print(p +" ");
//                 j++;
//             }
//         }
//     System.out.println();
//     }
//     }

//     static boolean isprime(int n){
//         int fc=0;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 fc++;
//             }
//         }
//         return (fc==0 && n>1);
//     }
// }