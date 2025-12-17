package Chapter13Threads;

class SumDemo extends Thread{
    int sum = 0;

    public void run(){
        synchronized (this){
            for(int i=1;i<=50;i++){
                sum +=sum;
            }this.notify();
        }
    }
}
public class interThreadCom {
    public static void main(String[] args) throws InterruptedException {
        SumDemo th = new SumDemo();
        th.start();

        synchronized (th){
            th.wait();
            System.out.println("Sum is "+th.sum);
        }
    }
}
