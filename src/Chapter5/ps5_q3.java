package Chapter5;// Print multiplication table

import java.util.Scanner;

public class ps5_q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number for table: ");
        int table = sc.nextInt();

        for(int i =1; i<=10;i++){
            System.out.println(table + " X "+i+" = "+table*i);
        }
        sc.close();
    }
}
