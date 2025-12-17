package Chapter10Inheritance;

class Base{
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am In Base Class and setting X now");
        this.x = x;
    }
}
class Derived extends Base{  // create a child class
    int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
        System.out.println("I am in Child Class ()");
    }
}


class c1Inheritence{
    public static void main(String[] args) {
        // Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        // b.setY(4);                 // We cannot access child class from base class
        // System.out.println(b.getY());

        // Creating an object of Derivrd (child) class
        Derived d = new Derived();
        d.setX(10);
        System.out.println(d.getX());

        d.setY(20);
        System.out.println(d.getY());
    }
}

