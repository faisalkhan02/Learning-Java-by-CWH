package Chapter11;

/*
 
Create a class telephone with rings, 
lift,and disconnect methods as abstract methods . 
Create another class Smartphone and demonstrate polymorphism
 */
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
    
}
class SmartPhone extends TelePhone{
    @Override
    void ring(){
        System.out.println("Ringinging...");
    }
    @Override
    void lift(){
        System.out.println("lifting...");
    }
    @Override
    void disconnect(){
        System.out.println("Disconnecting...");
    }
}
public class Ps11_Q4_Demontrate_Polymorphism {
    public static void main(String[] args) {

        // Polymorphism: Parent class reference -> Child class object
        TelePhone t = new SmartPhone();
        t.ring();
        t.lift();
        t.disconnect();
    }
    
}