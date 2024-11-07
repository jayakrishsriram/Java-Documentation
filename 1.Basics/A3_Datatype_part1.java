public class A3_Datatype_part1 {
    public static void main(String[] args) {
        // Similar to c and C++ 
        char a = 'a' ; // Must be mentioned in single quotes
        //char c = 'hel'; // you get an error
        String b= "hello"; // Must be mentioned in double quotes
        Boolean var3 = true; // Boolean data type
        int d;
        d=5;
        double ef=0.65;
        float f=1.23f; // For float you have to declare f at the end
        double e=5e-3; // It indicates that it is 5 ^ -3
        int g=10_000;// Underscore can be placed for our understanding purpose
        byte h=123;
        short i=1245;
        long j=1503l; // Using l at end is your choice both will work 
        int k=0b101; // int will also accept binary,hexadicimal format
        System.out.println(a);
        System.out.println(b);
        System.out.println(var3);
        System.out.println(d);
        System.out.println(e);
        System.out.println(ef);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        a++;
        System.out.println(a);
    }
    
}
