import java.util.Random;

public class Random_function {
    public static void main(String[] args){
    Random rand=new Random();
    int max=100,min=50;
    // Here is formula to generate a random numbers with a specific range, where min and max are our lower and higher limit of number.
    //nt randomNum = rand.nextInt(max – min + 1) + min;
    int random_val=rand.nextInt(max-min+1)+min;
    System.out.println("Random integer is = "+random_val);
}
}
