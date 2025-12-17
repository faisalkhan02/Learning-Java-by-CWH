package Chapter10Inheritance;    /*
 Getter and setter method for question 2
 */

class Rectangle5{
    private int length;
    private int width;

    Rectangle5(int length,int width){
        this.length = length;
        this.width = width;
        System.out.println("I am Rectangle class cunstructor");
    }
    // getter for length
    public int getLength(){
        return length;
    }
    // Setter for length
    public void setLength(int length){
        this.length = length;
    }
    // getter for width
    public int getWidth(){
        return width;
    }
    // Setter for width
    public void setWidth(int width){
        this.width = width;
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
class Cuboid2 extends Rectangle5{
    private int height;

    Cuboid2 (int length,int width,int height){
        super(length, width);
        
        this.height = height;
        System.out.println("I am Cuboid class cunstructor");
    }
    // getter for height
    public int getHeigth(){
        return height;
    }
    // Setter for width
    public void setHeigth(int height){
        this.height = height;
    }
    double volumn(){
        return getLength()*getWidth()*height;
    }
    double surfaceArea(){
        int l = getLength();
        int w = getWidth();
        int h = height;
        return 2*(l*w + w*h + l*h);
    }
    void displayDetails(){
        System.out.println("=====Cuboid Details=====");
        System.out.println("Area: "+ surfaceArea());
        System.out.println("Perimeter: "+volumn());
    }
}
public class Ps10_q4 {
    public static void main(String[] args) {
        Rectangle5 rc = new Rectangle5(10,5);
        rc.displayDetails();
        Cuboid2 cd = new Cuboid2(10, 5, 3);
        cd.displayDetails();
    }
}
