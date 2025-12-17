package Chapter13Threads;

// How do you get reference to the current  thread in java?

class Test3 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
public class Ps15_Q5 {
    public static void main(String[] args) {
        Test3 t2 = new Test3();
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
