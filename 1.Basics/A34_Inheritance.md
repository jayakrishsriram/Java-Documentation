# Basic structure of Java with respect to inheritance
Video link for reference(Youtube online source)-[Video](https://www.youtube.com/watch?v=u2oT-qogaFI&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=54)
Let us define there are three classes namely A, B, C. 
Structure is like:
class A{...}
class B extends A{...}
class C extends B{...}

Its original Structure is like
class A extends Object{...}
class B extends A{...}
class C extends B{...}

By default All the classes inherits Object class which is predefined. So the parent class will always inherit Object class even if you didn't extend it.

When you initialize a reference for class C, The constructor of Class A executes first followed by B only then C. This is because of super() which is initialized in Class C Constructor.

Lets Look More into it.
Class C extends B{
    public C(){
        super(); // Even if super class is not mentioned it executes this statement
        Then your code in constructor C
    }
}

Now if you work with Constructor overloading what will happen with the example of full code. For simplicity we will consider only 2 class
class A{
    public A(){
        sout("A Empty is executed");
    }
    public A(int a){
        sout("A with parameter is executed");
    }
}
class B extends A{
    public B(){
        sout("B Empty is executed");
    }
    public B(int b){
        sout("B with parameter is executed");
    }
}
public class C{
    public static void main(String args[]){
        B var1=new B();
         \\ Here the output is => 
        A Empty is executed 
        B Empty is executed
        B var2=new B(5); 
        The expected output is
        A with parameter is executed
        B with parameter is executed
        But the actual output is: 
        A Empty is executed
        B with parameter is executed 
    }
}
On seeing var2 how it is possible. It is because by default super() is executed and not super(int a) so to get the expected output you have to modify the class B. The code below will help to get the output:
class B extends A{
    public B(){
        sout("B Empty is executed");
    }
    public B(int b){
        super(b); This line will call the parameterized constructor of Class A
        sout("B with parameter is executed");
    }
}

Now if i need the following output:
A Empty is executed
B Empty is executed
B with parameter is executed

we can use var2. We just need to modify class B
class B extends A{
    public B(){
        sout("B Empty is executed");
    }
    public B(int b){
        super(b); This line will call the parameterized constructor of Class A
        this()
        sout("B with parameter is executed");
    }
}