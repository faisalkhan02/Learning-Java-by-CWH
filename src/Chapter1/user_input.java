import java.util.Scanner;

public class user_input{

   public static void main(String[] args) {
       
       System.out.println("Taking Input From the User");
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter number 1: ");
       int a = sc.nextInt();

       System.out.print("Enter number 2: ");
       int b=sc.nextInt();

       int sum = a+b;
       System.out.println("Sum is: "+sum);

        System.out.print("Enter a word: " );
        String sr = sc.next();
        System.out.println("Word is: "+sr);
         sc.nextLine();
        System.out.print("Enter a sentence: " );
        String sentence = sc.nextLine();
        System.out.println("Sentence is: "+sentence);

         System.out.print("Enter a Float: " );
        float fl = sc.nextFloat();
        System.out.println("Float number is: "+fl );
             sc.close();
   }
}