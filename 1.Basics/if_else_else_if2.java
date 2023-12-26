public class if_else_else_if2 {
    public static void main(String[] args) {
        String a="Hey";
        String b="Hey";
        String c="hey";  // Case sensitive 
        if(a.equals(b))
        {
            System.out.println(a==b);
            if(a!=c)
            {
                System.out.println("a.equals= "+a.equals(c));
                System.out.println("Length= "+a.length());
                System.out.println("a.equalsIgnoreCase= "+a.equalsIgnoreCase(c));            
                System.err.println(a.charAt(0) );
            }   
        }
    }
}
