class A{
    public A(){
        System.out.println("A Empty is executed");
    }
    public A(int a){
        System.out.println("A with parameter is executed");
    }
    public void T(){
        System.out.println("T method in A is executed");
    }

}
class B extends A{
    public B(){
        System.out.println("B Empty is executed");
    }
    public B(int b){
        
        super(b); 
        System.out.println("B with parameter is executed");
    }
}
class C extends A{
    public C(){
        System.out.println("C Empty is executed");
    }
    public C(int b){
        this();
        System.out.println("C with parameter is executed");
    }
}
class D extends A{
    public D(){
        System.out.println("D Empty is executed");
    }
    public void T(){ // Method T is overriding as Class A also has Method T. T method in Class D is executed because of overriding.
        System.out.println("T method in D is called");}
}
public class A34_Inheritance_Part_2 {
    public static void main(String[] args) {
        B var2=new B(5); 
        C var1=new C(3);
        D var3=new D();
        var3.T();
        var1.T();
    }
}
