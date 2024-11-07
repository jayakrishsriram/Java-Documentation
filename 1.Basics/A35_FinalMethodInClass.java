class Example{
void m1(){
    System.out.println("hello");
}
final void m2(){
    System.out.println("Final hello");
}
void m3(){
    System.out.println("see there");
}
}

public class A35_FinalMethodInClass extends Example{
    
    /*
    void m2(){
        System.out.println("Try"); m2() in FinalMethodInClass cannot override m2() in Example overridden method is final
    }
     */
    void m3(){
        System.out.println("see");
    }
    public static void main(String[] args) {
        A35_FinalMethodInClass n1=new A35_FinalMethodInClass();
        n1.m1();
        n1.m2();
        n1.m3();
    }
}
/*
 * Final class is used to define in the last layer of the class This can prevent other class, Methods from other classes from inheriting it or modifying at child level.
 * Syntax:
 *     public final class class_name{ ... }
 */
