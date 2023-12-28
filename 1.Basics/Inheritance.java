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

public class Inheritance {
    public static void main(String[] args) {
        Developer dev=new Developer();
        dev.displaySalary();
        Tester tester=new Tester();
        tester.displaySalary();
    }
}
