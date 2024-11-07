package aq2;
import aq.A28_Access_modifiers_3;
/* Commands to follow
 * javac -d . A28_Access_modifiers_6.java
 * java aq2.A28_Access_modifiers_6
 */
public class A28_Access_modifiers_6 {
    public static void main(String[] args) {
        A28_Access_modifiers_3 j=new A28_Access_modifiers_3();
        // System.out.println(j.c); Cannot be printed as it comes under protected class
        System.out.println(j.d);
    }
}
