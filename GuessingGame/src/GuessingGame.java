import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int targetNumber = new Random().nextInt(100);
    int inputNumber;
    boolean foundNumber = false;
    int tries = 5;
    while (tries > 0 && !foundNumber) {
      System.out.println("Tente acertar um número entre 0 a 100:");
      inputNumber = scanner.nextInt();
      if (inputNumber == targetNumber) {
        foundNumber = true;
        System.out.println("Você acertou!");
      } else {
        tries--;
        System.out.println("Você errou, tem mais " + tries + " tentativas.");
      }
    }
    if ( tries == 0 ) {
      System.out.println("O número era: " + targetNumber);
    }
  }
}