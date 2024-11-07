abstract class bus{
    abstract void engine();
    void breaks(){
        System.out.println("Break applied");
    }
}
class Redbus extends bus{
    void engine(){
        System.out.println("Capacity is 50");
    }
}
class Volvobus extends bus{
    void engine(){
        System.out.println("Capacity is 90");
    }
}

public class A36_Abstraction {
    public static void main(String[] args) {
        Redbus n1=new Redbus();
        n1.breaks();
        n1.engine();
        Volvobus n2=new Volvobus();
        n2.breaks();
        n2.engine();
    }
}
