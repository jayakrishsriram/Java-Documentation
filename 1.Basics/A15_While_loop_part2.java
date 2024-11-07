import java.util.Scanner;
public class A15_While_loop_part2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Welcome to the test");
System.out.println("Question 1: what is 2+2 in letters");
String ans1 = scan.next();

while(!ans1.equals("four")){
System.out.println("You had the wrong answer try again what is 2+2 in letters: ");
ans1 = scan.next();
}
System.out.println("Great you had the right answer");
scan.close();
}}