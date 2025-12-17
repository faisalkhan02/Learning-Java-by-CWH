package Chapter9AccessModifier;

class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

}

public class Ps9_q1 {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder();
        
        cl.setHeight(12);
        int h = cl.getHeight();
        System.out.println(h);

        cl.setRadius(6);
        int r = cl.getRadius();
        System.out.println(r);
    }
}
