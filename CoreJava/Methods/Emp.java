import java.util.Scanner;
class Emp{
	
        String empId;
	String empName;
	int empMarks;

       void m1(String empId , String empName, int empMarks){
          this.empId=empId;
	  this.empName=empName;
	  this.empMarks=empMarks;
        }
       void display(){
	   System.out.println(empId +"   " + empName + "    "+ empMarks);
	}

        public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
           Emp x= new Emp();
           Emp x1= new Emp();
           Emp x2= new Emp();
           System.out.println("Enter emp id , emp name , emp marks for object 1");
           x.m1(sc.next(),sc.next(),sc.nextInt());
           System.out.println("Enter emp id , emp name , emp marks for object 2");
           x1.m1(sc.next(),sc.next(),sc.nextInt());
           System.out.println("Enter emp id , emp name , emp marks for object 3");
           x2.m1(sc.next(),sc.next(),sc.nextInt());
           x.display();
	   x1.display();
	   x2.display();

	}
}