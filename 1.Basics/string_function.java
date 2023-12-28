public class string_function {
    public static void main(String[] args) {
        String a="Hey";
        String b="Hey";
        String c="hey";  // Case sensitive 
        String d,e;
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println("a.equals= "+a.equals(c));
        System.out.println("Length= "+a.length());
        System.out.println("a.equalsIgnoreCase= "+a.equalsIgnoreCase(c));            
        System.err.println(a.charAt(0) );
        System.out.println(a.compareTo(c));
        d="Hello world program";
        System.out.println("Is the string starts with He? "+a.startsWith("He"));
        System.out.println("Is the string starts with He? "+c.startsWith("He"));
        System.out.println("Is the string ends with ey?"+a.endsWith("ey"));
        System.out.println("Substring to extract world from d: "+d+" is "+d.substring(6,11));
        System.out.println("Index of He?"+a.indexOf("He"));
        System.out.println("Last index of "+a.lastIndexOf("ey"));
        System.out.println("Replace program with Welcome! ===> "+d.replace("program",",Welcome!"));
        e="This-is-a-test-string";
        String[] sp=e.split("-");
        for(String s: sp)
        System.out.println(s);
        d="    Hello world   program   ";
        System.out.println(d);
        System.out.println(d.trim());
            } 
        
    
}
