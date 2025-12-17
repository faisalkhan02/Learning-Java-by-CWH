package Chapter13Threads;

class PriorityTest extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Hello friends");
        }
    }
}
class PriorityTest2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("hmmmmnaaaa");
        }
    }
}
public class Ps15_Q3 {
    public static void main(String[] args) {
        PriorityTest p1 = new PriorityTest();
        PriorityTest2 p2 =new PriorityTest2();

        p1.setPriority(6);
        p2.setPriority(9);

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        p1.start();
        p2.start();

    }
}
