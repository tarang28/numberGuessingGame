import java.util.Random;
import java.util.Scanner;
public class numberGuessingGame {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      Random random = new Random();
    
      int lowerBound = 1;
      int upperBound = 100;

      int numberToGuess = random.nextInt(upperBound - lowerBound + 1);
      int attempts = 0;
      int maxAttempts = 5;
      System.out.println("Welcome to the Number Guessing Game");
      System.out.println("I have selected a Number between" + lowerBound + " and " + upperBound + ", Can you Guess it?");
      
      while (attempts < maxAttempts){
        System.out.println("Enter the Guess Number: ");
        int userGuess = sc.nextInt();
        attempts++;

        if(userGuess == numberToGuess){
            System.out.println("Congratulations! you've guessed the correct number in " +  attempts + "attempts.");
            break;
        }
        else if(userGuess < numberToGuess) {
            System.out.println("try a higher number.");
        }
        else{
            System.out.println("Try a lower number."); 
        }
      }
      if(attempts == maxAttempts){
        System.out.println("Sorry, You've reached the maximum number of attempts. The correct number was: " + numberToGuess);
      }
      System.out.println("Thanks for playing!");
    }
}
