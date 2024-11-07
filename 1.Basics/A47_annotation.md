# Annotation
In Java, an annotation is a special form of metadata that can be added to Java code elements (classes, methods, variables, etc.). Annotations provide additional information that can be used by the compiler, development tools, or runtime systems to perform certain actions or enforce certain behaviors. They do not directly affect the execution of code but are often used for purposes like configuration, documentation, or code analysis.

# Key Uses of Annotations:
Compiler Instructions: Provide hints or directives to the compiler (e.g., @Override).
Runtime Processing: Used by frameworks and libraries to modify behavior at runtime (e.g., @SpringBootApplication in Spring).
Code Generation: Some tools or frameworks use annotations to generate additional code or configurations (e.g., Lombok's @Getter, @Setter).

## Commonly Used Annotations in Java:
@Override

Indicates that a method is intended to override a method in a superclass.
It helps avoid mistakes, as the compiler checks if the method is actually overriding something.


Example:

class Parent {
    public void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    public void display() {  // Correctly overriding the method
        System.out.println("Child display");
    }
}

# Other Common annotation:

@Deprecated: Marks a method, class, or field as deprecated, meaning it should no longer be used. The compiler gives a warning if the deprecated element is used.
@SuppressWarnings: Instructs the compiler to ignore specific warnings for the annotated element (e.g., unchecked warnings when dealing with generics).
@SafeVarargs: Suppresses warnings about potentially unsafe operations on varargs (variable-length arguments) in methods or constructors.
@FunctionalInterface: Ensures that the interface it is applied to is a functional interface (an interface with exactly one abstract method), which is used for lambda expressions.
@Documented: Marks that the use of the annotation should be documented in the Javadoc.
@Retention: Specifies how long annotations are retained (e.g., source-level, compile-level, or runtime-level).
@Target: Specifies which elements (e.g., methods, fields, classes) the annotation can be applied to.
@Inherited: Allows an annotation to be inherited from a superclass.