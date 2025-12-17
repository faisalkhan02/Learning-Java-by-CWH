package Chapter13Threads;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){

//        while(true) {
            System.out.println("I am a thread");
//        }
    }
}
public class ThreadBasic3Constructor {
    public static void main(String[] args) {

        MyThr t = new MyThr("Faisal");
        MyThr t2 = new MyThr("Khan");
        t.start();
        System.out.println("Thread id is: "+ t.getId());
        System.out.println("Name of this thread is: "+ t.getName());

        System.out.println("Thread2 id is: "+ t2.getId());
        System.out.println("Name of thread2 is: "+ t2.getName());
    }

}
