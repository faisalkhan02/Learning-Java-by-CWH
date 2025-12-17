package Chapter10Inheritance;

class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v) {
        a = v;
    }

    public int returnOne() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int c) {
        super(c);
        System.out.println("I am a Constructor");
    }
}

public class c3Super {

    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        DoClass d = new DoClass(10);
        System.out.println(e.getA());
    }
}