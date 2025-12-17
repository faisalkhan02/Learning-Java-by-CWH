package Chapter14Errors_Exception;

import java.util.Scanner;

class myException extends Exception{
    public String toString(){
        return " I am toString()";
    }
    public String getMessage(){
        return " I am getMessage()";
    }
}
public class Ch7_ClassException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a;
        a=sc.nextInt();
        if(a<9){
            try {
                throw new myException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
