class T1 extends Thread{
    public void run(){ // Method needs to be named run 
    for(int i=0;i<10;i++){
        System.out.println("Hi");
        try {
            Thread.sleep(10); // You can use sleep only inside try catch or using throws
        } catch (InterruptedException e) {}
    }}
}
class T2 extends Thread{
    public void run(){
    for(int i=0;i<10;i++){
        System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {}
    }
}
}
public class A52_Threads2 {
    public static void main(String[] args) {
        T1 a=new T1();
        T2 b=new T2();
        a.start();
        b.start();
    }
}
