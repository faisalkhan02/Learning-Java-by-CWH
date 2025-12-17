package Chapter14Errors_Exception;

public class  Ch4_Exception {
    public static void main(String[] args) {
        int a = 60;
        int b = 0;

        // without try:
        // int c = a/b;
        //     System.out.println("The result is: "+c);

        try{
            int c = a/b;
            System.out.println("The result is: "+c);
        }catch(Exception e){
            System.out.println("We failed to divide, Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program"); // this will not be execute if we try it without "try"
    }
}
