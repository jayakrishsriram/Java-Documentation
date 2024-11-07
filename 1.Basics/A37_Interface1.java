// Define an interface
interface Animal {
    void sound();  // Abstract method, no implementation
    void sleep();  // Another abstract method
}

// Class implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("The dog barks");
    }
    
    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}

// Class implementing the interface
class Cat implements Animal {
    public void sound() {
        System.out.println("The cat meows");
    }
    
    public void sleep() {
        System.out.println("The cat is sleeping");
    }
}

// Main class
public class A37_Interface1{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Calls the Dog class method
        dog.sleep();  // Calls the Dog class method
        
        Animal cat = new Cat();
        cat.sound();  // Calls the Cat class method
        cat.sleep();  // Calls the Cat class method
    }
}

