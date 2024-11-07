class throws_try{
    public void tr() throws ClassNotFoundException
    {
        Class.forName("className");
    }
}
public class A50_throws {
    public static void main(String[] args) {
        throws_try a =new throws_try();
        try {
            a.tr();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
