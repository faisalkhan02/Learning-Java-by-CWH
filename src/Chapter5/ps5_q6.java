package Chapter5;// print factorial using while loop

import java.util.Scanner;

public class ps5_q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int num = sc.nextInt();

        int fact = 1;

        while(num>=1){
            fact*=num;
            num--;
        }
        System.out.println("Factorial is: "+fact);
        sc.close();
    }
}
