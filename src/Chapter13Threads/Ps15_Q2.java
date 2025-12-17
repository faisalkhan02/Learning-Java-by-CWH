package Chapter13Threads;

//Add a sleep method in thread of question1 to delay its execution for 200ms.

class PracticeQuestion3 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(5000);
            }catch (Exception e ){
                System.out.println(e);
            }
            System.out.println("Welcome");

        }
    }
}

class Test extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(2000);
            }catch (Exception e ){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}

public class Ps15_Q2 {
    public static void main(String[] args) {

        PracticeQuestion3 t1 = new PracticeQuestion3();
        Test t2 = new Test();
        t1.start();
        t2.start();
    }
}
