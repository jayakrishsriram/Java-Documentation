@FunctionalInterface
interface Greeting {
    void sayHello();
}
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
public class A48_Lambda_Expression{
    public static void main(String[] args) {
        // Lambda expression implementing the sayHello method
        Greeting greeting = () -> System.out.println("Hello, world!");
        greeting.sayHello();
         // Lambda expression with two parameters (a and b)
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
         System.out.println("Sum: " + addition.operate(5, 3));  // Output: 8
         System.out.println("Difference: " + subtraction.operate(5, 3));  // Output: 2
        MathOperation multiplication = (a, b) -> {
            int result = a * b;
            return result;
        };

        System.out.println("Product: " + multiplication.operate(4, 6));  // Output: 24
    }
}