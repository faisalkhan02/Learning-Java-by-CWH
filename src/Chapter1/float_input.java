package Chapter1;

import java.util.Scanner;

public class float_input{

    public static void main(String[] args) {
        
        System.out.println("Enter float input from the user");
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter 1st float number: ");
        float f1=sc.nextFloat();

        System.out.print("Enetr 2nd float number: ");
        float f2=sc.nextFloat();

        float sum1 = f1+f2;
        System.out.println("Float sum is: "+sum1);

        System.out.println("devided by 2 is: "+sum1/2);

        sc.close();
    }   
}