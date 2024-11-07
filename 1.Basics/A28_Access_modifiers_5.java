package  aq2;
import aq.A28_Access_modifiers_3;
public class A28_Access_modifiers_5 extends A28_Access_modifiers_3{//extends is used as the keyword for inheritance
    public static void main(String[] args) {
        A28_Access_modifiers_3 ew=new A28_Access_modifiers_3();
        // You cannot print a,b,c
        System.out.println(ew.d);
        A28_Access_modifiers_5 ne=new A28_Access_modifiers_5();
        // To print protected class we can use the current class to print it.
        System.out.println(ne.c);
        System.out.println(ne.d);

    }
}
