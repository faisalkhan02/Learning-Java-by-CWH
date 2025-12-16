package Chapter4;

import java.util.Scanner;

public class elseIf{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age;
    System.out.print("Enter your age: ");
    age = sc.nextInt();

    if(age>55){
        System.out.println("You are experienced");
    }
    else if(age>45){
        System.out.println("You are semi-experienced");
    }
    else if(age>36){
        System.out.println("You are semi-semi-experienced");
    }
    else{
        System.out.println("You are not experienced");
    }
    if(age>2){
        System.out.println("You are not a baby");
    }
    sc.close();
    }
}