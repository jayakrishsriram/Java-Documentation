public class For_loop3 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            System.out.println("Enter your average for the course "+i+1+" "); // note this error
            }
        for(int i=0; i<5; i++) {
            System.out.println("Enter your average for the course "+(i+1)+" "); 
            }
    }
}
