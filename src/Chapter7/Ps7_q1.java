package Chapter7;

import java.util.Scanner;

public class Ps7_q1 {
// print a table

static void multiplication(int n){
    for (int i=1; i<=10;i++){

        System.out.format("%d X %d = %d\n", n,i,n*i);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number for print table: ");
    int num = sc.nextInt();

    multiplication(num);
    sc.close();
}
    
}