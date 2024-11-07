public class A28_Access_modifiers_2 {
    public static void main(String[] args) {
        A28_Access_modifiers_1 sam=new A28_Access_modifiers_1();
        // System.out.println("A: "+sam.a);  --> You cannot print a because we used private access modifier.
        System.out.println("B: "+sam.b); // Can print b because it is default.
        System.out.println("C: "+sam.c);
        System.out.println("D: "+sam.d);
    }
}
