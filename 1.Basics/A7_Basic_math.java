public class A7_Basic_math {
    public static void main(String[] args) {
        System.out.println(5+10);
        double a =5;
        double b=10;
        double c=a+b;
        int f=10;
        int h=25;
        double e=a+f;
        //int g=a+f; //Error
        System.out.println("f + h = "+(f+h));
        System.out.println("a + c = "+(a+c));
        System.out.println("C x a = "+(c*a));
        System.out.println("C / A = "+(c/a));
        System.out.println("C % A = "+(c%a));// modulus (Remainder)
        System.out.println("Val e="+e);
        System.out.println("Value of a before update "+ a);
        a+=2;
        System.out.println("Value of a in 1st update "+a);
        System.out.println("Value of a in 1st update "+(a++)); //a++ is post increment
        System.out.println("Value of a in 2nd update "+a);
        System.out.println("Value of a in 3rd update "+(++a)); // ++a is pre increment
        a-=1;
        System.out.println("Value of a in 4th update "+a);
        System.out.println("Value of a in 5th update "+(--a));// --a is pre decrement a-- is also possible.



    }
}
