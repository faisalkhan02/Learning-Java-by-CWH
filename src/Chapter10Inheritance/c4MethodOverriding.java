package Chapter10Inheritance;

class A{
    public int a;

    public int Khan(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am a method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am a ethod 2 of class B"); // method overriding
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class c4MethodOverriding {
    public static void main(String[] args) {
        A a  = new A();
        a.meth2();
        
        B b = new B();
        b.meth2();
    }
}
