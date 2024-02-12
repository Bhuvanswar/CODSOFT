import java.util.*;
public class Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
         int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int N = random.nextInt(100) + 1;
            int x = 0;
            int m = 5;
            System.out.println("let the game begin");
            while (x< m) {
                System.out.print("Enter your guess: ");
                int n= sc.nextInt();
                sc.nextLine();

                x++;

                if (n == N) {
                    System.out.println("You win.");
                    score++;
                    break;
                } else if (n < N) {
                    System.out.println("Guess is low! Try again.");
                } else {
                    System.out.println("Guess is  high! Try again.");
                }
            }

            if (x>= m) {
                System.out.println("you are out .\n The correct number was " + N + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + score);

        }
}
