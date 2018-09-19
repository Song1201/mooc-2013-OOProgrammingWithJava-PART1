
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int counts = 1;
        while (true) {
            System.out.print("Guess a number: ");
            int numberGuessed = Integer.parseInt(reader.nextLine());
            if (numberGuessed == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (numberGuessed > numberDrawn) {            
                System.out.println("The number is lesser, guesses made: " +
                        counts);
            } else {
                System.out.println("The number is greater, guesses made: " + 
                        counts);
            }
            counts++;        
        }

        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
