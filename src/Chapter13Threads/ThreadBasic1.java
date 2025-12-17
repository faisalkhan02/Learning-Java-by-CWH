package Chapter13Threads;

class MyThread extends Thread{
    @Override
    public void run(){
        int i=1;
        while(i<1000){
            System.out.println("MyThread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int j=1;
        while(j<1000){

            System.out.println("Mythread 2 is written");
            System.out.println("You are sad");
            j++;
        }
    }
}

public class ThreadBasic1 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();

        t1.start();
        t2.start();  // Both execute randomly
    }
}
