class Math_Util{
    int a,b;
    Math_Util(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int add(){
        return this.a+this.b;
    }
    public void change(){
        a=23;
    }
    public int sub(){
        return a-b;
    }
}

public class A33_ClassesAndObject4_constructor {
    public static void main(String[] args) {
        Math_Util func=new Math_Util(4, 5);
        System.out.println(func.add());
        System.out.println(func.sub());
        func.change();
        System.out.println(func.add());
        System.out.println(func.sub());
    }
}
