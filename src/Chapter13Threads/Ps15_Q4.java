package Chapter13Threads;

//How do you get state of a given thread in java?
class Test2 extends Thread{
    @Override
    public void run() {
//        while (false){
//            System.out.println("Good Night");
//        }
    }
}
public class Ps15_Q4 {
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
    }
}
