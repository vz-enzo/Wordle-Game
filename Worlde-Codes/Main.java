// Maurizio Gonzalez
// Main class for wordle game

import java.util.Scanner;

public class Main {

    public static WordleGame startGame(Scanner scanner) {
      System.out.println("Which puzzle number would you like to play? (0-2315):");
      int puzzleNumber = scanner.nextInt();
      if (puzzleNumber < 0 || puzzleNumber > 2315) {
        System.out.println("Error, puzzle number out of range. Try again.");
        return null;
      }
      return new WordleGame(puzzleNumber);
    }
  
    public static void playGame(Scanner scanner, WordleGame game) {
      if (game == null) {
        System.out.println("Failed to start game, invalid puzzle number.");
        return;
      }
  
      while (!game.isGameOver()) {
        System.out.println("Enter guess (5 letters):");
        String guess = scanner.next();
        if (!WordBank.checkInDictionary(guess)) {
          System.out.println("Invalid guess, try again.");
        } else {
          game.guess(guess);
          System.out.println(game);
          if (game.isGameWin()) {
            System.out.println("Congratulations! Your guess was correct!");
            break;
          }
        }
      }
    }
  
    public static void reportGameOutcome(WordleGame game) {
      if (game == null) {
        System.out.println("Game could not be completed.");
      } else if (game.isGameWin()) {
        System.out.println("YOU WON! 🎉");
      } else {
        System.out.println("The answer was: " + game.getAnswer());
      }
    }
  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      WordleGame game = startGame(scanner);
      playGame(scanner, game);
      reportGameOutcome(game);
    }
  }