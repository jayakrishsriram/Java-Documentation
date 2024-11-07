class NewException extends Exception{
    public NewException(String error)
    {
        super(error);
    }
}
public class A49_CreateException {
    public static void main(String[] args) {
        try {
            throw new NewException("Hey try out");
        } 
        catch(NewException e) {
            System.out.println("Error executed "+e);
        }
    }
}
