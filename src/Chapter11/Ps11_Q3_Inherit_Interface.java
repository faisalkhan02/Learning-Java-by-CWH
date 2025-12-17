package Chapter11;

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal  {
    void eat();
    void sleep();

    
}
class Human extends Monkey implements BasicAnimal{
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

public class Ps11_Q3_Inherit_Interface {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.speak();
        h1.bite();
        h1.eat();
        h1.jump();
        h1.sleep();
    }
    
}