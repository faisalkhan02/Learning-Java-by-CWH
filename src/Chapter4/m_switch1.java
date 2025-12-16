package Chapter4;

import java.util.Scanner;

public class m_switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 55:
                System.out.println("You are going to get retired");
                break;

            default: 
            System.out.println("Enjoy your life!");
        }
        sc.close();
    }
}