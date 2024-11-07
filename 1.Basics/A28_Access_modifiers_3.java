//package aq;
/*
 * Remove // in first line. 
 * Then use javac -d . A28_Access_modifiers_3.java   -> This command is use to compile package 
 * To run it use java aq.A28_Access_modifiers_3
 */
public class A28_Access_modifiers_3{
    /*
     * In this we will see how to create a package how to use it, how to compile
     */
    private int a=10;
    int b=20;
    protected int c=23;
    public int d=34;
    public static void main(String[] args) {
            A28_Access_modifiers_3 sam=new A28_Access_modifiers_3();
            System.out.println("A: "+sam.a); 
            System.out.println("B: "+sam.b); 
            System.out.println("C: "+sam.c);
            System.out.println("D: "+sam.d);
    }
}