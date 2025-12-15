// (Easy-medium) Read two integers from the user and print their sum. (use Scanner)
import java.util.Scanner;

    public class que2inputSum{
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first integer: ");
            int x = sc.nextInt();
            System.out.print("Enter second integer: ");
            int y = sc.nextInt();
            System.out.println("Sum = "+(x+y));
            sc.close();
        }
    }
