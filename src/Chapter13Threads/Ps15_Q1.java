package Chapter13Threads;

// Write a program to print "good morning" and "Welcome" continuously
// on the screen in java using Threads

class PracticeQuestion extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good Morning");
        }
    }
}

class PracticeQuestion1 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Welcome");
        }
    }
}
public class Ps15_Q1 {
    public static void main(String[] args) {
    PracticeQuestion t1 = new PracticeQuestion();
    PracticeQuestion1 t2 = new PracticeQuestion1();

    t1.start();
    t2.start();
    }
}
