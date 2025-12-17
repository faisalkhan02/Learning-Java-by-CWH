package Chapter9AccessModifier;

import java.util.*;
class numberGame{ 
    int number;
    int guess;
    int noOfGuesses = 0;
    Scanner sc = new Scanner(System.in);

    // set getter  and setter
    public int getNoOfGusess(){
        return noOfGuesses;
    }
    public void setNoOfGusess(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    numberGame(){
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1;

    }
    void takeInput(){
        System.out.print("Guess the number (1 to 100): ");
        guess = sc.nextInt();
        
    }
    boolean isCorrectNumber(){
        noOfGuesses++;

        if(guess == number){
            System.out.printf("Yes you guess it right, it was %d\nYou guessed it in %d attempt\n",guess,noOfGuesses);
            return true;
        }
        else if(guess<number){
            System.out.println("Too Low..");
        }
        else if(guess>number){
            System.out.println("Too High..");
        }
        return false;
        
    }
    // sc.close();
}


public class number_guess_game {
    public static void main(String[] args) {
        numberGame game = new numberGame();
        boolean b = false;
        while (!b) {
            
            game.takeInput();
            b = game.isCorrectNumber();
            System.out.println(b);
        }
        
    }
}
