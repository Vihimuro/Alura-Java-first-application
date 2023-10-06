import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctNumber = new Random().nextInt(100);
        int totalOfGuesses = 5;
        int guesses = 0;
        int currentNumber;
        while (guesses < totalOfGuesses){
            guesses++;

            System.out.println("Enter the " + guesses+ " attempt number");
            currentNumber = sc.nextInt();

            if (currentNumber == correctNumber){
                System.out.println("You won!");
                break;
            }
            else if (currentNumber < correctNumber){
                System.out.println("Too low!");
            }
            else {
                System.out.println("To high!");
            }


            if(guesses == 5) {
                System.out.println("You lost :C the number was "+ correctNumber);
            }
        }
    }
}
