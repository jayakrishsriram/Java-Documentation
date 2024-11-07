
class Example {
    // Static field
    static int staticCounter = 0;

    // Non-static (instance) field
    int instanceCounter = 0;

    // Static method
    static void staticMethod() {
        // Accessing static field directly
        staticCounter++;
        System.out.println("Static counter: " + staticCounter);

        // Attempting to access non-static field directly (this will cause an error)
        // instanceCounter++;  // Uncommenting this line will cause a compilation error

        // To access the non-static field, we need an instance of Example
        Example instance = new Example();
        instance.instanceCounter++;
        System.out.println("Instance counter accessed through an instance: " + instance.instanceCounter);
    }

    // Non-static method
    void nonStaticMethod() {
        // Accessing both static and non-static fields directly
        staticCounter++;
        instanceCounter++;
        System.out.println("Static counter in non-static method: " + staticCounter);
        System.out.println("Instance counter in non-static method: " + instanceCounter);
    }
}

public class A43AccessingNonStaticvarinStatic {
    public static void main(String[] args) {
        // Calling the static method without creating an instance
        Example.staticMethod();

        // Creating an instance to call the non-static method
        Example obj = new Example();
        obj.nonStaticMethod();
    }
}
