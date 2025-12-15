package Chapter1;// Calculate percentage of a student marks

import java.util.Scanner;
public class Exercise1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter 1st subject marks: ");
        int sub1 =sc.nextInt();
        System.out.print("Enter 2nd subject marks: ");
        int sub2 =sc.nextInt();
        System.out.print("Enter 3rd subject marks: ");
        int sub3 =sc.nextInt();
        System.out.print("Enter 4th subject marks: ");
        int sub4 =sc.nextInt();
        System.out.print("Enter 5th subject marks: ");
        int sub5 =sc.nextInt();

        int sum =sub1+sub2+sub3+sub4+sub5;
        float percentage = (sum/5.0f);

        System.out.println("Total % is: "+percentage);
        sc.close();
    }
}