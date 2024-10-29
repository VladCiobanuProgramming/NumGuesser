import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomGeneratedNumber = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number guessing game");

        int numberGuessed = 0;

        while (true) {
            System.out.print("Enter your guess (1-100): ");

            if (scanner.hasNextInt()) {
                numberGuessed = scanner.nextInt();

                if (numberGuessed < 1 || numberGuessed > 100) {
                    System.out.println("invalid range, try again.");
                    continue; // Skip the rest of the loop and prompt again
                }

                if (numberGuessed < randomGeneratedNumber) {
                    System.out.println("guess higher");
                } else if (numberGuessed > randomGeneratedNumber) {
                    System.out.println("guess lower");
                } else {
                    System.out.printf("You guessed right! %d was the generated number.%n", randomGeneratedNumber);
                    break; // Exit the loop
                }
            } 
            else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
