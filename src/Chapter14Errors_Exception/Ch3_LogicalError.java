package Chapter14Errors_Exception;

import java.util.Scanner;

public class Ch3_LogicalError {
    public static void main(String[] args) {
        System.out.print("Enter k: ");
        int k; // if value of k is enter 0 or alph.character its runtime error
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);
        sc.close(); 
    }
}
