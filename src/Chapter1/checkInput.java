package Chapter1;

import java.util.Scanner;

public class checkInput{

    public static void main(String[] args) { //
        
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}