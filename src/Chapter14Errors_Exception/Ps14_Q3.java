package Chapter14Errors_Exception;

import java.util.Scanner;

class MaxAttemptsException extends Exception{
    public String toString(){
        return "Maximum attempts reached! Access denied.";
    }
}
public class Ps14_Q3 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = {35, 40, 60};

        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        int maxAttempts= 5;

        while (flag && attempts<5) {
            try {
                System.out.print("Enter array index: ");
                int index = sc.nextInt();
                System.out.println("The value of Marks[index] is: " + marks[index]);
                break;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index");
                attempts++;
                if(attempts ==maxAttempts){
                    try{
                        throw new MaxAttemptsException();
                    }catch (MaxAttemptsException ex){
                        System.out.println(ex);
                    }
                }
            }
        }
    }
}
