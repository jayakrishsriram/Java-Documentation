class Math_Util{
    int a,b;

    public Math_Util() {
        a=3;
        b=2;
    }
    
    public Math_Util(int a,int b){
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
public class A33_Constructor_overload{
    public static void main(String[] args) {
        Math_Util func=new Math_Util(4, 5);
        System.out.println(func.add());
        System.out.println(func.sub());
        Math_Util func2=new Math_Util();
        System.out.println(func2.add());
        System.out.println(func2.sub());
    }
}