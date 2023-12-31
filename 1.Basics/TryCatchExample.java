import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the numerator
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            // Prompt the user to enter the denominator
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform the division and display the result
            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");

        } catch (java.util.InputMismatchException e) {
            // Handle input mismatch (non-integer input)
            System.out.println("Error: Please enter valid integers.");

        } finally {
            // Close the scanner in the finally block to ensure it is closed
            // regardless of whether an exception occurred or not
            scanner.close();
        }
    }

    // Method to perform division
    private static double divide(int numerator, int denominator) {
        // Check if denominator is zero
        if (denominator == 0) {
            // Throw an ArithmeticException if attempting to divide by zero
            throw new ArithmeticException("Division by zero");
        }

        // Return the result of the division
        return (double) numerator / denominator;
    }
}
