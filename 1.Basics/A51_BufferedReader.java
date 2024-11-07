
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A51_BufferedReader { // Old way to get input
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
        int number=Integer.parseInt(bf.readLine());
        System.out.println(number);
        bf.close();
    }
}
