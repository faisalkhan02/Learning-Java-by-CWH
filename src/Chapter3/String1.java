package Chapter3;

public class String1{

    public static void main(String[] args) {
        
        String name = new String("Faisal");
        String name2 = "Faisal";

        System.out.println(name);
        System.out.println(name2);

        int a = 5;
        float b = 5.5f;

        System.out.printf("The value of a is %d and value of b is %.2f\n",a,b);
        System.out.format("The value of a is %d and value of b is %f",a,b);

    }
}