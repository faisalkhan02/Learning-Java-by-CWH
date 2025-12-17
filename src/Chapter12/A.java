package Chapter12;

public class A {
    public void show(){
        System.out.println("public method");
    }

    private void secret(){
        System.out.println("Privater secret method!");
    }

    public void accessSecret() {
        secret(); // allowed
    }

    public static void main(String[] args) {

    }
}
