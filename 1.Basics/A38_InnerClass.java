class ABC{ // Cannot give static to class ABC
    public void show(){
        System.out.println("ABC class is executed");
    }
    class B{
        public void display(){
            System.out.println("Class B is executed");
        }
    }
    static class C{
        public void display(){
            System.out.println("Class C is executed");
        }
    }
}

public class A38_InnerClass {
    public static void main(String[] args) {
        ABC obj=new ABC();
        obj.show();
        ABC.B obj1=obj.new B();
        obj1.display();
        ABC.C obj2=new ABC.C();
        obj2.display();
    }
}
