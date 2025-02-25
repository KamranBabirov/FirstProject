import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess number between 1 and 100:");

        int guess;
        do {
            guess = scanner.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Guess higher.");
            } else if (guess > numberToGuess) {
                System.out.println("Guess lower.");
            } else {
                System.out.println("Congratulations!  Its True.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }
}
