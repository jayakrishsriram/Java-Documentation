public class A17_For_loop {
    public static void main(String[] args) {
        System.out.println("-----------------1st------------------------");
        for(double i=0;i<15;i++)
        {System.out.println(i);}
        System.out.println("-----------------2nd-------------------------");
        for(double i=0;i<15;i+=2)
        {System.out.println("2nd: "+i);}
        System.out.println("-----------------3rd-------------------------");
        for(double i=0;i<5;i+=0.5)
        {System.out.println(i);}
        System.out.println("-----------------4rd-------------------------");
        // Second way to do for loop.
        int i=1;
        for(;i<=5;)
        {System.out.println(i);
        i++;}
    }
}
