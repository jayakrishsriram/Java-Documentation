public class A20_String2 {
    /*
     * Basic string info is explained in 1.basic Folder
     * Over here we will go with some more concept covering the basics again with few updated content.
     */
    
    public static void main(String[] args) {
        System.out.println("Ways of Creating a string");
        String a=new String("Hello");
        String b="Hey";
        StringBuffer c=new StringBuffer("Hi");
        String d=new String(c);
        StringBuilder e=new StringBuilder("Hola");
        String f=new String(e);
        char[] g={'a','b','c','d','e'};
        String h=new String(g);
        String i= new String(g,2,1);
        String j= new String(g,2,2);  // new String(variable,offset,count) offset->Staring index, count-> No.of.elements
        System.out.println(j);
        byte[] k={97,98,99};//Converts the byte value to ASCII value 
        String l=new String(k);
        System.out.println(l);
    }
}
