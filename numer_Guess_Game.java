import java.util.*;

public class numer_Guess_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        Random ran = new Random();
	        boolean play_Again = true;
	        int rounds_Won = 0;

	        while (play_Again) {
	            int random_Number = ran.nextInt(100) + 1;
	            int attempts = 0;
	            boolean guessed_Correctly = false;
	            int max_Attempts = 5;

	            System.out.println("Guess a number between 1 and 100. You have " + max_Attempts + " attempts.");

	            while (attempts < max_Attempts && !guessed_Correctly) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scan.nextInt();
	                attempts++;

	                if (userGuess == random_Number) {
	                    System.out.println("Congratulations! You've guessed the correct number.");
	                    guessed_Correctly = true;
	                    rounds_Won++;
	                } else if (userGuess < random_Number) {
	                    System.out.println("Too low!");
	                } else {
	                    System.out.println("Too high!");
	                }

	                if (attempts == max_Attempts && !guessed_Correctly) {
	                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + random_Number);
	                }
	            }

	            System.out.println("Rounds won: " + rounds_Won);
	            System.out.print("Do you want to play again? (yes/no): ");
	            String user_Response = scan.next();

	            if (!user_Response.equalsIgnoreCase("yes")) {
	                play_Again = false;
	            }
	        }

	        System.out.println("Thank you for playing! Your total rounds won: " + rounds_Won);
	        scan.close();

	}

}
