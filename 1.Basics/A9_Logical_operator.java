public class A9_Logical_operator {
    public static void main(String[] args) {
        boolean a = 1<2 & 2<3; // And operation
        System.out.println(a);
        a= 1>2 && 2<3; // And operation
        System.out.println(a);
        a=1>2 | 2>3; // Or operation
        System.out.println(a);
        a=1<2 || 2>3; // Or operation
        System.out.println(a);
        a=!(1<2); // Not operation
        System.out.println(a);

    }
}
