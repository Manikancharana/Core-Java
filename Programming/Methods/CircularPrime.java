import java.util.Scanner;
class CircularPrime{
static int digitcount(int n){
int x=0;
while(n>0){
n/=10;
x++;
}
return x;

}
static boolean isprime(int n){
for(int i=2;i<=Math.sqrt(n);i++){
if(n%i==0) {
return false;
}
}
return true;
}
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int m=0,d1=0,c=0;
int n=sc.nextInt();
int d=digitcount(n);
for(int i=1;i<=d;i++){
int r=n%10;
n/=10;
d1=(int)Math.pow(10,(d-1));
n=r*d1+n;
if(isprime(n)){
c++;
}
}
if(c==d){
System.out.println("Its a Circular Prime Number");
}
else System.out.println("It's not a Circular Prime ");
}
}