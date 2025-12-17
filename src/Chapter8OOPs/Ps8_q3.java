package Chapter8OOPs;

class Square{
    int side ;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class Ps8_q3 {
    public static void main(String[] args) {
        Square sq = new Square();

        sq.side = 3;
        System.out.println("Area is: "+sq.area());
        System.out.println("Perimeter is: "+sq.perimeter());

    }
    
}
