interface Interface0{ 
    int a=10; // By default it is final and static
    void show();
    void config();
}
class Interface1 implements Interface0{
    public void show(){
        System.out.println("in Show");
    }
    public void config(){
        System.out.println("in Config");
    }
}
public class A37_Interface0 {
    public static void main(String[] args) {
    Interface0 obj=new Interface1();
    obj.show();
    obj.config();
    System.out.println(obj.a);
}
}
