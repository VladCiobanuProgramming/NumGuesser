import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int RandomGeneratedNumber = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in); // Integrating scanner type as user input
        System.out.println("This is \u001b[35;1mNumGuesser\u001b[0m . A number guesser from 1 to 100.?");
        System.out.println("Can you guess the right number?");
        int NumberGuessed;
        NumberGuessed = scanner.nextInt();
        while (NumberGuessed==(int) NumberGuessed) {
            if (NumberGuessed < RandomGeneratedNumber) {
                System.out.println("Input is \u001b[31;4msmaller\u001b[0m than generated number.");
                NumberGuessed = scanner.nextInt();
            }
                if (NumberGuessed > RandomGeneratedNumber){
                    System.out.println("Input is \u001b[32;4mlarger\u001b[0m than generated number.");
                    NumberGuessed = scanner.nextInt();
                }
                if(NumberGuessed==RandomGeneratedNumber){
                    System.out.printf("You guessed right ! %d was the generated number." , RandomGeneratedNumber);
                    break;
                }
                else if(NumberGuessed<=0 || NumberGuessed>=101){
                    System.out.println("Not a number 1-100.");
            }

        }
    }
}