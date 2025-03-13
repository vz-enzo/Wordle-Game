// Maurizio Gonzalez
// WordBank Class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordBank {

    public static String getAnswerForPuzzleNumber(int puzzleNumber) {
      try {
        Scanner scanner = new Scanner(new File("answers.txt"));
        for (int i = 0; i < puzzleNumber; i++) {
          if (scanner.hasNext()) {
            scanner.next();
          } else {
            System.out.println("Error, puzzle number out of range.");
            scanner.close();
            return null;
          }
        }
        if (scanner.hasNext()) {
          String answer = scanner.next();
          scanner.close();
          return answer;
        } else {
          System.out.println("Error: No word available at selected index.");
          scanner.close();
          return null;
        }
      } catch (FileNotFoundException e) {
        System.out.println("File not found!");
        return null;
      }
    }
  
    public static boolean checkInDictionary(String proposed) {
      try {
        Scanner scanner = new Scanner(new File("dictionary.txt"));
        String proposedLower = proposed.toLowerCase();
        while (scanner.hasNext()) {
          String word = scanner.next().toLowerCase();
          if (word.equals(proposedLower)) {
            scanner.close();
            return true;
          }
        }
        scanner.close();
      } catch (FileNotFoundException e) {
        System.out.println("Dictionary file not found.");
      }
      return false;
    }
  }