public class A28_Access_modifiers_1 {
    /* There are 4 types of access specifiers:
     *  1. only within the class  -> public
     *  2. only within the package -> protected
     *  3. outside of the package but within the same subclass object that to using subclass reference -> default
     *  4. from all places of the project -> private
     */
    private int a=10;
    int b=20;
    protected int c=23;
    public int d=34;
    public static void main(String[] args) {
        A28_Access_modifiers_1 sam=new A28_Access_modifiers_1();
        System.out.println("A: "+sam.a);
        System.out.println("B: "+sam.b);
        System.out.println("C: "+sam.c);
        System.out.println("D: "+sam.d);
    }
}
/*
 * There will be no error and all a,b,c,d will be printed
 */