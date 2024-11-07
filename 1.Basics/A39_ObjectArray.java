class Student{
int mark;
int age;
String name;
}
// Code is correct sometimes error with extension. Just compile and check it.
public class A39_ObjectArray {
    public static void main(String[] args) {
        Student n1=new Student();
        n1.age=16;
        n1.mark=90;
        n1.name="Jai";
        Student n2=new Student();
        n2.age=14;
        n2.mark=93;
        n2.name="Jk";
        Student n3=new Student();
        n3.age=13;
        n3.mark=94;
        n3.name="Jaik";
        Student arr[]=new Student[3];
        arr[0]=n1;
        arr[1]=n2;
        arr[2]=n3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Name: "+arr[i].name+" Age: "+arr[i].age+" Mark: "+arr[i].mark);
        }
        for (Student s: arr){
            System.out.println("Name: "+s.name+" Age: "+s.age+" Mark: "+s.mark);
        }
    }
}
