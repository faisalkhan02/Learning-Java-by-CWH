package Chapter2;

import java.util.Scanner;

public class Ps2q3{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.println(a>8);
        sc.close();
    }
}