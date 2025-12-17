package Chapter11;

class Monkey2{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal2  {
    void eat();
    void sleep();

    
}
class Human2 extends Monkey2 implements BasicAnimal2{
    void speak(){
        System.out.println("Hello sir..");
    }
    // @Override
    public void eat(){
        System.out.println("eating...");
    }
    // @Override
    public void sleep(){
        System.out.println("sleeping");
    }
}

public class Ps11_Q5Increase_Q3 {
    public static void main(String[] args) {
        Monkey2 m1 = new Human2();
        m1.bite();
        // m1.speak(); // cannot use speak method beacause the monkey which doess not have speak method
        
        BasicAnimal2 b1 = new Human2();
        b1.eat();
        b1.sleep();
        // b1.speak(); // not allow
        
        System.out.println("=== Human Obj ===");
        Human2 h1 = new Human2();
        
        h1.jump(); // monkey method
        h1.eat();   // basichuman method
        h1.speak(); // human method
    }
}