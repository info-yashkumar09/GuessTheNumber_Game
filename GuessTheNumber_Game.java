package Projects;
import java.util.*;
public class GuessTheNumber_Game {

    //Private Member
    private final int secretNumber;

    //Constructor
    public GuessTheNumber_Game(){
        this.secretNumber = (int)(Math.random()*100)+1;
    }

    //Play Method
    public void play(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the 'Guess the Number Game'");

        //Allow user to select the no. of attempts between 1 and 6 only to make game more interesting
        int maxAttempts;
        while (true) {
            System.out.print("Enter how many attempts you want (1 to 6): ");
            maxAttempts = sc.nextInt();
            if (maxAttempts >= 1 && maxAttempts <= 6) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
            }
        }

        int attempts = 0;
        boolean hasWon = false;

        System.out.println("I have selected a number between 1 to 100. Now you try to Guess that number !");
        while(attempts< maxAttempts){
            System.out.print("Enter your Guess: ");
            int userGuess = sc.nextInt();
            attempts++;

            if(userGuess>secretNumber){
                System.out.println("Your Guess is High!");
            }
            else if(userGuess<secretNumber){
                System.out.println("Your Guess is Low!");
            }
            else{
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("Congrats, You Guessed the number in "+attempts+" attempts! Secret Number is "+secretNumber);
        }
        else{
            System.out.println("Sorry you used all your "+attempts+" attempts!\nThe Secret Number was "+secretNumber);
        }

        sc.close();
    }

    //Main Method
    public static void main(String[] args) {
        GuessTheNumber_Game game = new GuessTheNumber_Game();
        game.play();
    }
}
