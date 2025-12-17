package Chapter13Threads;

class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    public void run(){
        int i=1;
        while (i<1000){
//            System.out.println("I am thread");
            System.out.println("Thank You "+ this.getName());
                i++;
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1("faisal 1");
        MyThread1 t2 = new MyThread1("faisal 2");
        MyThread1 t3 = new MyThread1("faisal 3");
        MyThread1 t4 = new MyThread1("faisal 4");
        MyThread1 t5 = new MyThread1("faisal 5 (Most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
