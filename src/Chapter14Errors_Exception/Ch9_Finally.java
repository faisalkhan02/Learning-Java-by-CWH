package Chapter14Errors_Exception;

public class Ch9_Finally {
    public static int greet(){
        try{
            int a =5;
            int b = 0  ;
            int c = a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("This is finally ");
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = greet();
        System.out.println(n);
    }
}
