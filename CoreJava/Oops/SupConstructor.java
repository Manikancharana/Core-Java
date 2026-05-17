// Statisfy super keyword at Constructor level.

class A{
A(){
System.out.println("hello Im in base class...");
}
}
class SupConstructor extends A{
SupConstructor(){
super();
System.out.println("im in derived class");
}

public static void main(String[] args){

SupConstructor x = new SupConstructor();
}
}