package Chapter4;

import java.util.Scanner;

public class ps4_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check: ");
        int year = sc.nextInt();

          // One-line condition
        // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))


        if (year % 400 == 0) {
            System.out.println("This is a leap year");
        } 
        else if (year % 100 == 0) {
            System.out.println("This is not a leap year");
        } 
        else if (year % 4 == 0) {
            System.out.println("This is a leap year");
        } 
        else {
            System.out.println("This is not a leap year");
        }

        sc.close();
    }
}
