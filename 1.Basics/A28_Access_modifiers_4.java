//package aq;
/* Commands for reference 
 * javac -d . A28_Access_modifiers_4.java
 * java aq.A28_Access_modifiers_4
 */
public class A28_Access_modifiers_4 {
    public static void main(String[] args) {
        A28_Access_modifiers_3 sam =new A28_Access_modifiers_3();
            // System.out.println("A: "+sam.a);  --> You cannot print a because we used private access modifier.
            System.out.println("B: "+sam.b); // Can print b because it is default.
            System.out.println("C: "+sam.c);
            System.out.println("D: "+sam.d);
    }
}
