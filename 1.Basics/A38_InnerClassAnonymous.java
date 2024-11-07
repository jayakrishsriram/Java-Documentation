class AC{
    public void disp(){
        System.out.println("Hello");
    }
}
public class A38_InnerClassAnonymous {
    public static void main(String[] args) {
        
    
    AC a= new AC(){
        public void disp(){
            System.out.println("Hello Anonymous");
        }
    };
    a.disp();
}
}
