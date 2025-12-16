package Chapter4;

import java.util.Scanner;
//  find web site type

public class ps4_q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter website url: ");
        String check1 = sc.next();

        if (check1.endsWith(".org")){
            System.out.println("This is a organizational website");  
        }

        else if(check1.endsWith(".in")){
            System.out.println("This is a Indian website");  
        }
        
        else if(check1.endsWith(".com")){
            System.out.println("This is a commercial website");  
        }

        sc.close();
    }
}