public class A26_Execution_of_var{
    // Static variable
    static int a=10;
    // Instance variable
    int b=23;
    public static void main(String[] args) {
        int c=245;
        System.out.println("A: "+a);
        //System.out.println(b); You can't Print b . Error -> Non static variable cannot be used in static context
        System.out.println("C: "+c);
        // To print b follow this one
        A26_Execution_of_var var=new A26_Execution_of_var();
        System.out.println("B: "+var.b);
    }
}