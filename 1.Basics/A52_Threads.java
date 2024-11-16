class T1 extends Thread{
    public void run(){ // Method needs to be named run
    for(int i=0;i<10;i++){
        System.out.println("Hi");
    }}
}
class T2 extends Thread{
    public void run(){
    for(int i=0;i<10;i++){
        System.out.println("Hello");
    }}
}

public class A52_Threads{
    public static void main(String[] args) {
        T1 a=new T1();
        T2 b=new T2();
        a.start();
        b.start();
    }
}
/* The program is executing parallelly but we couldn't see as it is small count. Increase the i value to 100 in both to find the difference */