package Chapter2;//check a entered num is integer

import java.util.Scanner;

public class fifth{


     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");

    //Scanner sc= new Scanner();
     
    System.out.println(sc.hasNextInt());
          sc.close();
     }
}