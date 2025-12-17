package Chapter9AccessModifier;

class Sphere{
    private int radius ;

    int getRadius(){
        return radius;
        
    }
    void setRadius(int radius){
        this.radius = radius;
    }
    double getVolume(){
        return 4.0/3.0 * Math.PI * radius*radius*radius;
    }
    double getSurfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
}


public class Ps9_q5 {
    public static void main(String[] args) {
        Sphere sp = new Sphere();
        sp.setRadius(5);
        System.out.println("Volume is: "+sp.getVolume());
        System.out.println("Surface area is: "+sp.getSurfaceArea());
    }
}
