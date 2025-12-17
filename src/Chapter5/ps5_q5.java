package Chapter5;

import java.util.Scanner;

public class ps5_q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to print factorial: ");
        int num = sc.nextInt();
        int factorial=1;

        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+num+" is: "+factorial);
    sc.close();
    }
}
