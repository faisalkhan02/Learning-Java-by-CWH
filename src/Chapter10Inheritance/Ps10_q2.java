package Chapter10Inheritance;    /*
 Create a class rectangle and use inheritence to 
 create another class Cuboid . Try to keep it as close to 
 real world Scenerio as possible
 */

class Rectangle4{
    int length;
    int width;
    Rectangle4(int length,int width){
        this.length = length;
        this.width = width;
        System.out.println("I am Rectangle class cunstructor");
    }
    double area(){
        return length*width;
    }
    double perimeter(){
        return 2*(length+width);
    }

    void displayDetails(){
        System.out.println("=====Rectangle Details=====");
        System.out.println("Area: "+ area());
        System.out.println("Perimeter: "+perimeter());
    }
}
class Cuboid extends Rectangle4{
    int height;

    Cuboid (int length,int width,int height){
        super(length, width);
        
        this.height = height;
        System.out.println("I am Cuboid class cunstructor");
    }
    double volumn(){
        return length*width*height;
    }
    double surfaceArea(){
        return 2*(length*width + width*height + height*length);
    }
    void displayDetails(){
        System.out.println("=====Cuboid Details=====");
        System.out.println("Area: "+ surfaceArea());
        System.out.println("Perimeter: "+volumn());
    }
}
public class Ps10_q2 {
    public static void main(String[] args) {
        Rectangle4 rc = new Rectangle4(10,5);
        rc.displayDetails();
        Cuboid cd = new Cuboid(10, 5, 3);
        cd.displayDetails();
    }
}
