
import java.util.Arrays;

public class A24_Functions { // Function in java is also said as procedure or subroutine. Sometime said as methods but this is used with classes
    
    static int x=10;
    void bye(){
        System.out.println("bye");
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    
    static void greet(String name)
    {
        System.out.println("Hello "+ name);
    }
    
    static int sum(int a,int b){
        return a+b;
    }
    
    static void display(int ...v) // Variable length argument
    {
        System.out.println(Arrays.toString(v));
    }

    static void change(int acc)
    {
        acc=10;
    }
    
    static void change_string(String name)
    {
        name="Ram";
    }
    
    static void change_arr(int[] num)
    {
        num[0]=999;
    }
    
    static void check()
    {
        double a=13;
        double b=12;
        if(a<b){
            System.out.println(b+" is smaller");
            int c=10;
            a=15;
            System.out.println(c);
        }
        else if(a>b){
            System.out.println(a+" is smaller");
             }
        else{
            System.out.println("A is equal");
        }
        /*  
            System.out.println(c); You cannot print c outside of the if block because it is defined inside and can be used only inside.
            But you can update the the outer value
        */
        System.out.println(a);
    }
    static byte jai() // But using byte and short is not recommended
    {
        System.out.println("d");
        return 3;
    }

    public static void main(String[] args) {
        sayHello();
        greet("Jai");
        int c=sum(1,3);
        System.out.println(c);
        // Java passes primitive types by value
        int acc=1;
        change(acc);
        System.out.println(acc);
        // Strings in Java are immutable objects, and they are also passed by value
        String name="Raj";
        change_string(name);
        System.out.println(name);
        // Arrays, like all objects in Java, are passed by reference value and not by reference. But if you change value it will affect the original value.
        int[] arr={10,20,30,40,50};
        change_arr(arr);
        System.out.println(Arrays.toString(arr));
        display();
        display(1,2,3,4,5,6,7,8,9,10);
        display(arr);
        check();//Look for this definition above with the comments
        System.out.println(x); // this will print the x declared outside
        x=x+10; // This will change the outer x value
        System.out.println(x); 
        int x= 987;
        System.out.println(x); //This will print the inner x while shadowing the outer x
        byte ty=jai();
        System.out.println(ty);
        // Cannot call non-static method in static method directly.
        A24_Functions byee=new A24_Functions();
        byee.bye();
    }
}
