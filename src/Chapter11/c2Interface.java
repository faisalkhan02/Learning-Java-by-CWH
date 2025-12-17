package Chapter11;

interface Bicycle {
    int r = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);

}
interface HornBicycle {
    void blowHorn2();
    void blowHornMhn();
    
}
class AvonCycle implements Bicycle , HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment ){
        System.out.println("Applying SpeedUP");
        
    }
    public void blowHorn2(){
        System.out.println("Kabhi khushi kabhi gum");
    }
    public void blowHornMhn(){
        System.out.println("Mai hu naa poo poo poo");
    }
}

public class c2Interface {
    public static void main(String[] args) {
        AvonCycle myCycle = new AvonCycle();
        myCycle.applyBrake(1);
        System.out.println(myCycle.r);
        // we can not modify the properties in interfaces as they are final
        myCycle.blowHorn2();
        myCycle.blowHornMhn();

    }
}
