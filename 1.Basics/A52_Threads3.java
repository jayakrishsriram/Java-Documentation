class T1 implements Runnable{
    public void run(){ // Method needs to be named run 
    for(int i=0;i<10;i++){
        System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {}
    }}
}
class T2 implements Runnable{
    public void run(){
    for(int i=0;i<10;i++){
        System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {}
    }
}
}
public class A52_Threads3 {
    public static void main(String[] args) {
        Runnable a=new T1();
        Runnable b=new T2();
        Thread a1=new Thread(a);
        Thread b1=new Thread(b);
        a1.start();
        b1.start();
    }
}
