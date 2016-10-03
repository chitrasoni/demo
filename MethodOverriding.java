class A{
public void display(){
System.out.println("A");
 }
}
class B extends A{
public void display(){
System.out.println("B");
 }
}
class MethodOverriding{
public static void main(String[] arg){
B o =new B();
o.display();
A s=new A();
s.display();
 }

}