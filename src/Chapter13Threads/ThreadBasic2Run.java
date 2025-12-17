package Chapter13Threads;

class MyThreadRun implements Runnable{
    public void run(){
        int i=1;
        while (i<100) {
            System.out.println("I am a runnable thread 1");
            i++;
        }
    }
}
class MyThreadRun2 implements Runnable{
    public void run(){
        int j=1;
        while (j<100) {
            System.out.println("I am 2nd thread");
            j++;
        }
    }
}
public class ThreadBasic2Run {
    public static void main(String[] args) {

        MyThreadRun bullet1 = new MyThreadRun();
        Thread gun1 = new Thread(bullet1);

        MyThreadRun2 bullet2 = new MyThreadRun2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
