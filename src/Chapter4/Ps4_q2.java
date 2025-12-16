package Chapter4;

import java.util.Scanner;

// Calculate Students marks and print a message
public class Ps4_q2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte m1,m2,m3;
        System.out.print("Enter Chemistry marks: ");
        m1 = sc.nextByte();
        System.out.print("Enter Physics marks: ");
        m2 = sc.nextByte();
        System.out.print("Enter Maths marks: ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;

        System.out.println("your overall percentage is : "+ avg);

        if(avg>=45 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You are Promoted ");
        }
        else{
            System.out.println("I am Sorry, You are not Promoted, Try again!");
        }
        sc.close();
    }
}