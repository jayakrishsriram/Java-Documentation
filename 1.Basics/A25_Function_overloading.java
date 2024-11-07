import java.util.Arrays;
public class A25_Function_overloading{
    static void add(){
        System.out.println(5+2);
    }
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(double a,double b){
        System.out.println(a+b);
    }
    static void add(double a,double b,double c){
        System.out.println(a+b+c);
    }
    static void add(String a,String b){
        System.out.println(a+b);
    }
    static void dis(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void dis(String ...a){
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
    add();
    add(2,3);
    add(2.12,2.34);
    add("Hello ","World");
    add(2.12,3.33,4.908);
    dis(2,3,4,5,6,8);
    dis("hey","john");
    //dis(); This will throw error only when we are using Function overloading
    }
}