package Chapter8OOPs;

class Circle{
    double radius;

    public double perimeter(){
        double result = 2*radius*22/7;
        return result;
    }
    public double area(){
        double result2 = radius*radius*22/7;
        return result2;
    }

}

public class Ps8_q6 {
    public static void main(String[] args) {
        Circle cr  = new Circle();
        cr.radius = 5;

        System.out.printf("Area of this circle is: %.2f\n",cr.area());
        System.out.println("Perimeter of this circle is: "+cr.perimeter());
        System.out.println("Perimeter of this circle is: "+cr.perimeter());
    }
}
