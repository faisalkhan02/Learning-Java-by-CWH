package Chapter7;

public class method_overloading {
    static void foo(){
        System.out.println("Hello I am Khan");
    }
    static void foo(int x){
        System.out.println("Good Morning Bro! this is "+x+ " 0verloading;");
    }
    static void foo(int x,int y){
        System.out.println("Good Evening bro");
    }

    public static void main(String[] args) {
        foo();
        foo(200);
        foo(2000,500);
    }
}
