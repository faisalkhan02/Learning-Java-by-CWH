package Chapter9AccessModifier;

class Cylinder3{
    private int radius;
    private int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public double surfaceArea(){
        return 2* Math.PI * radius * (height+radius);
    }
    public double volumn(){
        return Math.PI * radius * radius * height;
    }

}

public class Ps9_q2 {
    public static void main(String[] args) {
        Cylinder3 cl = new Cylinder3();
        
        cl.setHeight(12);
        int h = cl.getHeight();
        System.out.println("Height is: " + h);

        cl.setRadius(9);
        int r = cl.getRadius();
        System.out.println("Radius is: " + r);

        System.out.println("Surface Area is: " + cl.surfaceArea());
        System.out.println("Volumn is: " + cl.volumn());
    }
}