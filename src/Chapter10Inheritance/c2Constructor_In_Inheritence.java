package Chapter10Inheritance;

// Base class (Parent Class)
class Base2{

    Base2(){
        System.out.println("I am a Base Constructor");
    }
    Base2(int x){
        System.out.println("I am a Base Constructor with value of: "+x);
    }
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
}
// Child Class 
class Derived2 extends Base2{
    Derived2(){
        System.out.println("I am a Derived class Constructor");
    }
    Derived2(int x, int y){
        super(x);
        System.out.println("I am a Derived class overloaded Constructor with value of y as: "+y);
    }
    public int y;

    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}
// Grand Child Class
class Derived3 extends Derived2{
    Derived3(){
        System.out.println("I am a Grand Child class Constructor");
    }
    // with value constructor 
    Derived3(int x,int y, int z){
        super(x,y);
        System.out.println("I am a Grand Child class overloaded Constructor with value of z as: "+z);
    }

    public int z;

    public int getz(){
        return z;
    }
    public void setz(int z){
        this.z = z;
    }
}


public class c2Constructor_In_Inheritence {
    public static void main(String[] args) {
        // Base2 b2 = new Base2();
        
        // Derived2 d2 = new Derived2();

        Derived3 d3 = new Derived3(12,13,15);
    }
}
