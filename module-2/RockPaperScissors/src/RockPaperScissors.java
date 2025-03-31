// Tabari Harvey, 03/26/2025 Module 2 Programming Assignment
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       // String[] choices = {"rock", "paper", "scissors"};
        String rock ="1";
        String paper ="2";
        String scissors ="3"; 
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Choose your move (rock(1), paper(2), scissors(3)): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("1") && 
                !playerChoice.equals("2") && 
                !playerChoice.equals("3")) {
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                continue;
            }

         String[] choices = {"1", "2", "3"};
                 computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("1") && computerChoice.equals("3")) ||
                       (playerChoice.equals("2") && computerChoice.equals("1")) ||
                       (playerChoice.equals("3") && computerChoice.equals("2"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
