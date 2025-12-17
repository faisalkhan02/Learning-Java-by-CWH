package Chapter10Inheritance;// what is the order of Cunstructor execution for
// the following einheritance hierarchy
// Base  >>  Derived1 >>  Derived2

class Base3{
    Base3(){
        System.out.println("I am base class cunstructor");
    }
}
class Child1 extends Base3{
    Child1(){
        System.out.println("I am child1 class constructor");
    }
}
class Child3 extends Child1{
    Child3(){
        System.out.println("I am child3 class constructor");
    }
}
public class Ps10_q5 {
    public static void main(String[] args) {
    Child3 ch = new Child3();

    }
}
