package Chapter8OOPs;

class Cellphone{

    public void Ring(){
        System.out.println("Ringing...");
    }

    public void Vibrate(){
        System.out.println("Vibrating...");
    }

    public void CallFriend(){
        System.out.println("Calling to Faisal...");
    }
}   

public class Ps8_q2 {
    public static void main(String[] args) {
        Cellphone vivo = new Cellphone();

        vivo.CallFriend();
        vivo.Vibrate();
        vivo.Ring();
    }
}
