import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberToGuess = 341;
        int guessedNumber;
        int numberOfTries = 0;
        long startTime = System.currentTimeMillis();
        do {
            Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
            System.out.println("Wprowadź liczbę: ");
            guessedNumber = scanner.nextInt();

            if(guessedNumber > numberToGuess){
                System.out.println("Liczba jest za duża");
            }else if(guessedNumber < numberToGuess){
                System.out.println("Liczba jest za mała");
            }
            numberOfTries++;
        } while (guessedNumber != numberToGuess);
        long stopTime = System.currentTimeMillis();
        System.out.println("OK.");
        System.out.println("Liczba prób wynosi: " + numberOfTries);
        System.out.println("Czas gry wynosi: " + (stopTime - startTime));
    }
}
