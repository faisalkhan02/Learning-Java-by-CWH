package Chapter12_A;


import Chapter12.A;


public class PackageLearn2 {

    public static void main(String[] args) {
        System.out.println("I am class PackageLearn2 main method.");
        A obj = new A();
        obj.show();
//        obj.secret(); // Not allowed
        obj.accessSecret();


    }
}
