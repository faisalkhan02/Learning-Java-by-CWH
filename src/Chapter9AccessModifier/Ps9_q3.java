package Chapter9AccessModifier;

class Cylinder1{
    private int radius;
    private int height;
public Cylinder1(int myRadius, int myHeight){
    radius = myRadius;
    height = myHeight;
}
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public double surfaceArea(){
        return 2* Math.PI * radius * (height+radius);
    }
    public double volumn(){
        return Math.PI * radius * radius * height;
    }
}

public class Ps9_q3 {
    public static void main(String[] args) {
        Cylinder1 cl = new Cylinder1(12, 6);
        System.out.println("Surface is: " + cl.surfaceArea());
        System.out.println("Volumn is: " + cl.volumn());
    }
}
