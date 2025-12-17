package Chapter11;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("write something");
    }
    void refill(){
        System.out.println("refill this pen");
    }
    void changeNib(){
        System.out.println("Change the nib");
    }
}

public class Ps11_Q1Q2_Abstract {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
    }
    
}