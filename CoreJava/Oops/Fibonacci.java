import java.util.Scanner;
class Fibonacci{
static void fib(int n){
 int a=0,b=1,c1=0;
for(int i=1;i<=n;i++){
if(a+1==b){
    c1++;
}
else{
    for(int j=a+1;j<b;j++){
        System.out.print(j +" ");
    }
}
int c=a+b;
a=b;
b=c;
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
fib(n);
}
}
