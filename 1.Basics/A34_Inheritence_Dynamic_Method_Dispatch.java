class Ab{
    public void T(){
        System.out.println("A is executed");
    }

}
class B extends Ab{
    public void T(){ 
        System.out.println("B is called");}
}
class C extends Ab{
    public void T(){
        System.out.println("C is called");}
}
// Works only because of inheritance.
public class A34_Inheritence_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Ab obj=new Ab();
        obj.T();
        obj=new B();
        obj.T();
        obj=new C();
        obj.T();

    }
}
