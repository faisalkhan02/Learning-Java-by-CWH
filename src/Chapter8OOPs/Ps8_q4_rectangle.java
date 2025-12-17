package Chapter8OOPs;

class Rectangle3{
    int length;
    int width;

    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}

public class Ps8_q4_rectangle {
    public static void main(String[] args) {
        Rectangle3 ra = new Rectangle3();
        ra.length = 5;
        ra.width = 4;

        System.out.println("Area of rectangle is: "+ra.area());
        System.out.println("Perimeter of rectangle is: "+ra.perimeter());
    }
    
}
