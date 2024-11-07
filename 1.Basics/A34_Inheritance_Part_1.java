class Employee{
    //employee as base class 
    protected double salary=30000D;
    public Employee(){
        System.out.println("This is a constructor of Employee");
    }
}
class Developer extends Employee{
    //Develope is the child class of employee
    double bonus = 10000;
    public Developer(){
        System.out.println("This is a constructor of Developer");
    }
    public void displaySalary(){
        System.out.println("The salary is :"+(salary+bonus)+"\n");
    }
}
class Tester extends Employee{
    //Develope is the child class of employee
    double bonus = 20000;
    public Tester(){
        System.out.println("This is a constructor of Tester");
    }
    public void displaySalary(){
        System.out.println("The salary is :"+(salary+bonus)+"\n");
    }
}
// Inheritance either uses .java file or .class file.  If you have any one it will work. Inheritance will work with one file which defines multiple class or can work with  multiple classes in different file.

public class A34_Inheritance_Part_1 {
    public static void main(String[] args) {
        Developer dev=new Developer();
        dev.displaySalary();
        Tester tester=new Tester();
        tester.displaySalary();
    }
}
