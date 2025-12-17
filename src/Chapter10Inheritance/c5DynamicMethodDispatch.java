package Chapter10Inheritance;

class Phone{
    public  void greet(){
        System.out.println("Good Morning");
    }
    public  void name(){
        System.out.println("My name is Java");
    }
}
class Smartphone extends Phone{
    public void swagat(){
        System.out.println("welcome to class two");
    }
    public void name(){
        System.out.println("My name is Java in class two");
    }
}
public class c5DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // Smartphone sp = new Smartphone();
        // obj.greet();

        Phone ph = new Smartphone();
        // Smartphone ph2 = new Phone();  // not allowed

        ph.greet();
        // ph.swagat();  // not allowed for class smartphone(dynamic method dispatch)
        ph.name();  // allowq1
    }
}
 