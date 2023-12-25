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
    /*
     * To get the integer we use scan.nextInt()
     * To get the Float we use scan.nextFloat()
     */
    scan.close();// need to close the scan at the last else we will get a error(Exception in thread "main" java.util.NoSuchElementException)
    sca.close();
    sc.close();
   

}
    
}
