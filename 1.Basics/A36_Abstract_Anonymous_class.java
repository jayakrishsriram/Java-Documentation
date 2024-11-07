abstract class a{ 
    public abstract void show();
}
public class A36_Abstract_Anonymous_class {
    public static void main(String[] args) {
        a ne=new a(){
            public void show(){
                System.out.println("B in main class");
        }
    };
    ne.show();
}
}
