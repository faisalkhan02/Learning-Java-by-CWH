package Chapter4;// Rock, Paper, Scissors game
import java.util.Scanner;
import java.util.Random;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int user_Win = 0;
        int computer_Win = 0;

        System.out.println(" Welcome to Rock, Paper, Scissors Game!");
        System.out.println("----------------------------------------");

        for (int i = 1; i <= 5; i++) {
            // computer input
            int computer_choice = rand.nextInt(3) + 1;
            // user input
            System.out.println("\nRound " + i + ":");
            System.out.println("Enter 1 for Scissors");
            System.out.println("Enter 2 for Rock");
            System.out.println("Enter 3 for Paper");
            System.out.print("Your choice: ");
            
            int user_input = sc.nextInt();
            
            // validate input
            if (user_input < 1 || user_input > 3) {
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                i--; // repeat this round
                continue;
            }

            

            // Show names instead of numbers
            String[] names = {"", "Scissors", "Rock", "Paper"};
            System.out.println("Computer chose: " + names[computer_choice]);
            System.out.println("You chose: " + names[user_input]);

            // Game logic
            if ((user_input == 1 && computer_choice == 3) ||
                (user_input == 3 && computer_choice == 2) ||
                (user_input == 2 && computer_choice == 1)) {
                user_Win++;
                System.out.println(" You win this round!");
            } else if (user_input == computer_choice) {
                System.out.println(" It's a draw!");
            } else {
                computer_Win++;
                System.out.println(" Computer wins this round!");
            }
        }

        // Final result
        System.out.println("\n==============================");
        System.out.println("Final Scores:");
        System.out.println("You won: " + user_Win);
        System.out.println("Computer won: " + computer_Win);
        System.out.println("==============================");

        if (user_Win > computer_Win) {
            System.out.println(" Congratulations! You are the overall winner!");
        } else if (computer_Win > user_Win) {
            System.out.println(" Computer wins the game. Better luck next time!");
        } else {
            System.out.println(" It's a tie overall!");
        }

        sc.close();
    }
}
