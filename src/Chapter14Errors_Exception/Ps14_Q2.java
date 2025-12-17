package Chapter14Errors_Exception;

public class Ps14_Q2 {
    public static void main(String[] args) {
        try{
            int a=55/0;

        }catch (IllegalArgumentException e){
            System.out.println("HaaHaaahaaa");
        }
        catch (ArithmeticException e){
            System.out.println("HeeeHeee");
        }
    }
}
