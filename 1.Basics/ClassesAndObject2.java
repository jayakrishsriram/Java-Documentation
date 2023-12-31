class MathUtil{
    public static int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}

public class ClassesAndObject2 {
    public static void main(String[] args) {
       
        int b= MathUtil.add(5,3);// For static it better to call the class name instead of using method
        /*
        The code you provided has a small issue. 
        The add method in the MathUtil class is static, so you should call it using the class name rather than creating an instance of MathUtil.
        */
        MathUtil a=new MathUtil();
        int c=a.sub(5, 1);
        System.out.println("Add "+b);
        System.out.println("Sub "+c);
}
}
