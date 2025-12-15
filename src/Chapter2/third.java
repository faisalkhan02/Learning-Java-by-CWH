package Chapter2;

import java.util.Scanner;

public class third{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        
        String name = sc.nextLine();

        System.out.println("Hello "+name+", have a good day!");
        sc.close();
    }
}