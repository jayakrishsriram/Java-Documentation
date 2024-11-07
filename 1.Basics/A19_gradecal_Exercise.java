import java.util.Scanner;
public class A19_gradecal_Exercise {
public static void main(String[] args) {
System.out.print("How many course you had this semester:");
Scanner scan= new Scanner(System.in);
int x= scan.nextInt();
double[] nbcourses= new double[x];
double sum= 0;

for(int i=0; i<nbcourses.length; i++) {
    System.out.print("Enter your average for the course "+(i+1)+": ");
    nbcourses[i] = scan.nextInt();
    sum = sum + nbcourses[i];
    System.err.println();
}
double average = sum/nbcourses.length;
if (average >90){
    System.out.println("you have A");
} 
else if (90>= average && average>80) {
    System.out.println("You have B");
} 
else if (80 >= average && average > 70) {
    System.out.println("You have C");
} 
else if (78 >= average && average > 60) {
    System.out.println("You have D");
}
scan.close();
}
}
