package Chapter10Inheritance;

// Create a class Circle and use inheritence to
// create another class Clynder from it
class Circle2{
    int radius;

    Circle2(int radius){
        this.radius = radius;
        System.out.println("I am circle class perametarized cunstructer");
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder2 extends Circle2{
    Cylinder2(int radius, int height){
        super(radius);
        this.height = height;
        System.out.println("I am Cylinder class perameterized cunstuctor");
    }
    int height;

    public double area(){
        return Math.PI*2*this.radius*(this.height+this.radius);
    }
}
public class Ps10_q1 {
    public static void main(String[] args) {
        // Circle2 c = new Circle2(6);
        Cylinder2 cl = new Cylinder2(12 ,6);
        System.out.println(cl.area());
    }
}
