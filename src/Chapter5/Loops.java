package Chapter5;

public class Loops {

    public static void main(String[] args) {
        int i = 1;
        while (i<5) {
            System.out.println("I am line "+i);
            i++;
        }
        System.out.println("Loop terminated");

        while (true) {
            System.out.println("i am infinite loop");
            
        }
    }
}
