package Chapter9AccessModifier;

class Rectangle{
    private int length;
    private int breadth;

    public void rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

public class Ps9_Q4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(12,6);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
    }
}
