package Chapter11;

abstract class Base4{
    public Base4(){
        System.out.println("I am a base4 constructor");
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    abstract public void greet2();

    
}
class Child2 extends Base4{
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class Child4 extends Child2{
    public void ans(){
        System.out.println("I am good");
    }
}
public class c1_Abstract {
    public static void main(String[] args) {
        // Base4 bs = new Base4(); // not allow
        // Child3 ch = new Child3(); //not allow because it is a abstract method
        Child2 c = new Child2();
        c.greet();
        c.sayHello();
        
    }
}
