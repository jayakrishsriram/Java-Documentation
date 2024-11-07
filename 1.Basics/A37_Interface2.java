// Define an interface with default and abstract methods (from Java 8+)
interface Animal {
    void sound();  // Abstract method
    
    default void eat() {
        System.out.println("The animal is eating.");
    }
    
    static void info() {
        System.out.println("This is a static method in the Animal interface.");
    }
}

// Another interface extending the Animal interface (multilevel interface inheritance)
interface Mammal extends Animal {
    void habitat();  // Another abstract method
}

// Abstract class that partially implements an interface
abstract class WildAnimal implements Mammal {
    // Abstract class can implement some methods
    public void habitat() {
        System.out.println("The animal lives in the wild.");
    }
    
    // Abstract class can have its own abstract methods
    abstract void dangerLevel();
}

// Normal class extending an abstract class and fully implementing the interface
class Tiger extends WildAnimal {
    public void sound() {
        System.out.println("The tiger roars.");
    }

    public void dangerLevel() {
        System.out.println("The tiger is highly dangerous.");
    }
    
    // Override default method from the interface
    public void eat() {
        System.out.println("The tiger eats meat.");
    }
}

public class A37_Interface2 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.sound();  // Calls sound() method from the Tiger class
        tiger.habitat();  // Calls habitat() method from the WildAnimal abstract class
        tiger.dangerLevel();  // Calls dangerLevel() method from the Tiger class
        tiger.eat();  // Overridden method from the interface
        
        // Calling static method from the interface
        Animal.info();
    }
}



