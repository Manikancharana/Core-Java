import java.util.Scanner;
class AlphabetPattern{

	static void a(){
	    for(int i=1;i<=7;i++){
      	    for(int j=7;j>=i;j--){
            System.out.print(" ");
      	  }
      	  for(int j=1;j<=i;j++){
            if(j==1 || j==i || i==4){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
         }
         System.out.println();
   	   }
	}

     static void b(){
	    for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
             if(i==1 || j==1 || j==7|| i==4 || i==7){
                System.out.print("* ");
             }
             else{
                System.out.print("  ");
             }
          }
           System.out.println();
           }
	}


	static void c(){
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(i==1 || j==1|| i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
        }
        }


	static void d(){

	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(i==1 || j==1||j==7|| i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
        }

	}

	static void e(){

	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(i==1 || j==1||i==4|| i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void f(){

	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(i==1 || j==1||i==4){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
        }
	}

	static void g(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            
            if(i==1 || j==1 || (i>3 && j==4) || (i==7 && j<=4) || (i==4 && j>=4) || (j==7 && i>=4)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void h(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            
            if(i==4 || j==1 || j==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void i(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            
            if(j==4 || i==1 || i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void j(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            
            if(j==4 || i==1 || (i==7 && j<=4)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void k(){
	
	for(int i=1;i<=4;i++){
        for(int j=4;j>=i;j--){
            if(j==i || j==4 ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    for(int i=3;i>=1;i--){
        for(int j=4;j>=i;j--){
            if(j==i || j==4 ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void l(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(j==1 || i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void m(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(j==1 || j==7 || (i<=4 && j==i) || (i==3 &&j==5 || (i==2 && j==6))){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void n(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(j==1 || j==7 ||j==i ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void o(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(j==1 || j==7 ||i==1 ||i==7  ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void p(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(j==1 || (i==1 && j<=4) || (i<=4 && j==4)|| (i==4 && j<=4) ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void q(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if((j==1 && i<=6) || (i<=6 && j==6) || (j<=6 && i==1) || (i==6&& j<=6 ) || (i>=4 && j==i)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void r(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(j==1 || (i==1 && j<=4) || (i<=4 && j==4) || (i==4 && j<=4)|| (i==5 && j==2) ||(i==6 && j==3) ||(i==7 && j==4) ){
                System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }
        System.out.println();
    }
	}

	static void s(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(i==1 || (j==1 && i<=4 ) || i==4 || (j==7 && i>4) || i==7){
            System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }
        System.out.println();
    }
	}

	static void t(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(i==1 ||j==4 ){
            System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }
        System.out.println();
    }
	}

	static void u(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(i==7 ||j==1 || j==7 ){
            System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }
        System.out.println();
    }
	}

	static void v(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }
        for(int j=7;j>=1;j--){
            if(j==7 || (j==i )){
            System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }
        System.out.println();
    }
	}

	static void w(){
	
	for(int i=7;i>=1;i--){
        for(int j=1;j<=7;j++){
            if(j==1 || j==7 || (i<=4 && j==i) || (i==3 &&j==5 || (i==2 && j==6))){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void x(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(j==i || (j==7-i+1)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void y(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if((j==i && i<=4) || (j==7-i+1 && i<=4) || (j==4 && i>=4)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}

	static void z(){
	
	for(int i=1;i<=7;i++){
        for(int j=1;j<=7;j++){
            if(i==1 || (j==7-i+1) || i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
	}



	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s=sc.next();
	int n=s.length();
	for(int i=0;i<n;i++){
	char c=s.charAt(i);
	System.out.println();
	switch(c){
        case 'a' : a();
        break;
        
        case 'b' : b();
        break; 
        
        case 'c' : c();
        break;
        
        case 'd' : d();
        break;
        
        case 'e' : e();
        break;
        
        case 'f' : f();
        break;
        
        case 'g' : g();
        break;
        
        case 'h' : h();
        break;
        
        case 'i' : i();
        break;
        
        case 'j' : j();
        break;
        
        case 'k' : k();
        break;
        
        case 'l' : l();
        break;
        
        case 'm' : m();
        break;
        
        case 'n' : n();
        break;
        
        case 'o' : o();
        break;
        
        case 'p' : p();
        break;
        
        case 'q' : q();
        break;
        
        case 'r' : r();
        break;
        
        case 's' : s();
        break;
        
        case 't' : t();
        break;
        
        case 'u' : u();
        break;
        
        case 'v' : v();
        break;
        
        case 'w' : w();
        break;
        
        case 'x' : x();
        break;
        
        case 'y' : y();
        break;
        
        case 'z' : z();
        break;
        }
    }
	}
}
