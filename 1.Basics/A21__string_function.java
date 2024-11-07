public class A21__string_function {
    public static void main(String[] args) {
        String a="Hey";
        String b="Hey";
        String c="hey";  // Case sensitive 
        String d,e;
        System.out.println("==============================");
        System.out.println(a.equals(b)); 
        System.out.println(a==b);// Check with the object address. This is true because whenever you declare "Hey" in a,b the both refer to the same address because of java stack memory
        System.out.println("==============================");
        b=new String(b);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println("==============================");
        System.out.println("a.equals= "+a.equals(c));
        System.out.println("a.equalsIgnoreCase= "+a.equalsIgnoreCase(c));            
        e="This-is-a-test-string";
        String[] sp=e.split("-");
        for(String s: sp)
        System.out.println(s);
        d="    Hello world   program   ";
        System.out.println(d);
        System.out.println(d.trim());
            } 
}
