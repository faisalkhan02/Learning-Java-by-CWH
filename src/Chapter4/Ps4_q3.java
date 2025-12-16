package Chapter4;

import java.util.Scanner;

public class Ps4_q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in lakh ex.(5.5): ");

        float income = sc.nextFloat();
        float tax = 0;

        if (income<=2.5){
            tax = tax + 0;
        }
        else if (income>2.5 && income<=5){
            tax = tax + 0.05f * (5.0f - 2.5f);
        }
        else if (income>5f && income<=10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income>10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.3f * (income - 10f);

        }

        System.out.println("Yor Total payble tax is Rs.: " + tax*100000);
        sc.close();
    }
}