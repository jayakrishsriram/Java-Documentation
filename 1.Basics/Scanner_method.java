import java.util.Scanner;

public class Scanner_method {
    public static void main(String[] args){
    Scanner scan =new Scanner(System.in);// Get the input
    String t = scan.next();// Convert the input to string
    System.out.println(t);
    Scanner sca =new Scanner(System.in);
    Double d = sca.nextDouble();// Convert the input to double
    System.out.println(d);
    Scanner sc =new Scanner(System.in);
    Boolean b = sca.nextBoolean();// Convert the input to Boolean
    System.out.println(b);
    int i;
    Scanner s =new Scanner(System.in);
    i=s.nextInt();
    System.out.println(i);
    String w;
    char[] wor={'n','e','w','S','c','a','n','n'};
    w= new String(wor);
    System.out.println(w);

    /*
     * To get the integer we use scan.nextInt()
     * To get the Float we use scan.nextFloat()
     */

    /* The reason why we need to close a Scanner
     * It's generally a good practice to close the Scanner when you are done using it. 
     * Closing the Scanner releases the underlying system resources associated with it, and it's considered good resource management.
     * While not closing a Scanner might not lead to immediate issues in simple programs or small applications, in larger and more complex systems or when dealing with a lot of input, not closing resources properly can potentially cause resource leaks. 
     * This is because the Scanner class may hold onto system resources (like file handles or network connections) that should be released when they are no longer needed.
     */
    scan.close();
    sca.close();
    sc.close();
    s.close();

}
    
}
