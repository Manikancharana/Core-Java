import java.util.Scanner;
class AlphabetPattern2{

	static void a(int i){
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
   	   }

     static void b(int i){
            for(int j=1;j<=7;j++){
             if(i==1 || j==1 || j==7|| i==4 || i==7){
                System.out.print("* ");
             }
             else{
                System.out.print("  ");
             }
          }

	}


	static void c(int i){
        for(int j=1;j<=7;j++){
            if(i==1 || j==1|| i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

        }


	static void d(int i){

        for(int j=1;j<=7;j++){
            if(i==1 || j==1||j==7|| i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void e(int i){

        for(int j=1;j<=7;j++){
            if(i==1 || j==1||i==4|| i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void f(int i){

        for(int j=1;j<=7;j++){
            if(i==1 || j==1||i==4){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void g(int i){
	
        for(int j=1;j<=7;j++){
            
            if(i==1 || j==1 || (i>3 && j==4) || (i==7 && j<=4) || (i==4 && j>=4) || (j==7 && i>=4)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void h(int i){
	
        for(int j=1;j<=7;j++){
            
            if(i==4 || j==1 || j==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void i(int i){
	
        for(int j=1;j<=7;j++){
            
            if(j==4 || i==1 || i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void j(int i){
	
        for(int j=1;j<=7;j++){
            
            if(j==4 || i==1 || (i==7 && j<=4)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
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

	static void l(int i){
	
        for(int j=1;j<=7;j++){
            if(j==1 || i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
	}

	static void m(int i){
	

        for(int j=1;j<=7;j++){
            if(j==1 || j==7 || (i<=4 && j==i) || (i==3 &&j==5 || (i==2 && j==6))){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void n(int i){
	
        for(int j=1;j<=7;j++){
            if(j==1 || j==7 ||j==i ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void o(int i){
	
        for(int j=1;j<=7;j++){
            if(j==1 || j==7 ||i==1 ||i==7  ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void p(int i){
	
        for(int j=1;j<=7;j++){
            if(j==1 || (i==1 && j<=4) || (i<=4 && j==4)|| (i==4 && j<=4) ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void q(int i){
	
        for(int j=1;j<=7;j++){
            if((j==1 && i<=6) || (i<=6 && j==6) || (j<=6 && i==1) || (i==6&& j<=6 ) || (i>=4 && j==i)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void r(int i){
	
        for(int j=1;j<=7;j++){
            if(j==1 || (i==1 && j<=4) || (i<=4 && j==4) || (i==4 && j<=4)|| (i==5 && j==2) ||(i==6 && j==3) ||(i==7 && j==4) ){
                System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }

	}

	static void s(int i){
	
        for(int j=1;j<=7;j++){
            if(i==1 || (j==1 && i<=4 ) || i==4 || (j==7 && i>4) || i==7){
            System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }

	}

	static void t(int i){
	
        for(int j=1;j<=7;j++){
            if(i==1 ||j==4 ){
            System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }

	}

	static void u(int i){
	
        for(int j=1;j<=7;j++){
            if(i==7 ||j==1 || j==7 ){
            System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }

	}

	static void v(int i){
	
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
	}

	static void w(int i){
	
        for(int j=1;j<=7;j++){
            if(j==1 || j==7 || (i<=4 && j==i) || (i==3 &&j==5 || (i==2 && j==6))){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
 
	}

	static void x(int i){
	
        for(int j=1;j<=7;j++){
            if(j==i || (j==7-i+1)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
	}

	static void y(int i){
	
        for(int j=1;j<=7;j++){
            if((j==i && i<=4) || (j==7-i+1 && i<=4) || (j==4 && i>=4)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}

	static void z(int i){
	
        for(int j=1;j<=7;j++){
            if(i==1 || (j==7-i+1) || i==7){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }

	}



	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s=sc.next().toLowerCase();
	int n=s.length();
	
	
	for(int j=0;j<n;j++){

	for(int i=1;i<=7;i++){
	char c=s.charAt(j);
	switch(c){
        case 'a' : a(i);
        break;
        
        case 'b' : b(i);
        break; 
        
        case 'c' : c(i);
        break;
        
        case 'd' : d(i);
        break;
        
        case 'e' : e(i);
        break;
        
        case 'f' : f(i);
        break;
        
        case 'g' : g(i);
        break;
        
        case 'h' : h(i);
        break;
        
        case 'i' : i(i);
        break;
        
        case 'j' : j(i);
        break;
        
        case 'k' : k();
        break;
        
        case 'l' : l(i);
        break;
        
        case 'm' : m(i);
        break;
        
        case 'n' : n(i);
        break;
        
        case 'o' : o(i);
        break;
        
        case 'p' : p(i);
        break;
        
        case 'q' : q(i);
        break;
        
        case 'r' : r(i);
        break;
        
        case 's' : s(i);
        break;
        
        case 't' : t(i);
        break;
        
        case 'u' : u(i);
        break;
        
        case 'v' : v(i);
        break;
        
        case 'w' : w(i);
        break;
        
        case 'x' : x(i);
        break;
        
        case 'y' : y(i);
        break;
        
        case 'z' : z(i);
        break;
        }
 	System.out.print("   ");
	
	}
	System.out.println();
	}
}
}
