package Chapter7;

import java.util.Scanner;

public class Ps7_q3_recursion_sum {

    static int SumRect(int x){
        if(x==1){   // base condition
            return 1;
        }
        else{
            return x+SumRect(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth Natural number term: ");
        int num = sc.nextInt();
        int result = SumRect(num);

        System.out.println("Sum of 1st "+num+ " natural number is: "+result);
        sc.close();
    }
}
