package Chapter5;// sum first n numbers
import java.util.Scanner;

public class ps5_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth term to sum : ");
        int number = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=number;i++){
            sum+=i*2;
        }
        System.out.println("Sum of first "+number+" even numbers is: "+sum);
        sc.close();
    }
}
