import java.util.Random;
import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        // Guess the Random Number Game

        Scanner sc = new Scanner(System.in); // Scanner for user input
        Random rand = new Random(); // Random object for generating a number

        int n = rand.nextInt(100) + 1; // Generates a number between 1 and 100
        int attempts = 0;
        int maxAttempts = 10;
        int m;

        System.out.println("Guess the number (between 1 and 100): ");

        do {
            System.out.print("Enter your guess: ");
            
            // Ensure valid integer input
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
                sc.next(); // Clear invalid input
            }
            m = sc.nextInt();
            attempts++;

            if (m < n) {
                System.out.println("Try Again, the number is greater than " + m);
            } else if (m > n) {
                System.out.println("Try Again, the number is smaller than " + m);
            } else {
                System.out.println("Congratulations! You guessed it correctly in " + attempts + " tries.");
                break;
            }
            
            if (attempts >= maxAttempts) {
                System.out.println("Sorry! You've used all " + maxAttempts + " attempts. The correct number was " + n);
                break;
            }
        } while (m != n);
        
        sc.close();
    }
}
