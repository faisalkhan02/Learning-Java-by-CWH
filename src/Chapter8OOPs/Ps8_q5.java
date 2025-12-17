package Chapter8OOPs;

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }

}

public class Ps8_q5 {
    public static void main(String[] args) {
        Tommy tm  =new Tommy();

        tm.run();
        tm.fire();
        tm.hit();
    }
}
