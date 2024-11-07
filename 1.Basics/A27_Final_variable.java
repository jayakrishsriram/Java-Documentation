public class A27_Final_variable {
    static final int a=10;
    final int b=23;
    public static void main(String[] args) {
        final int c=20;
        System.out.println("A: "+a);
        System.out.println("C: "+c);
        A27_Final_variable var=new A27_Final_variable();
        System.out.println("B: "+var.b);
        //c+=10; You cannot modify the value which are declared with final.
    }
}
