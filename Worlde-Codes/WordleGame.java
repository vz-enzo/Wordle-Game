// Maurizio Gonzalez
// WordleGame Class

public class WordleGame {
    private WordleLetter[][] allGuesses = new WordleLetter[6][5];
    private String answer;
    private int currentGuess = 0;
  
    public WordleGame(int puzzleNumber) {
      this.answer = WordBank.getAnswerForPuzzleNumber(puzzleNumber);
    }
  
    public void guess(String guessWord) {
      for (int i = 0; i < guessWord.length(); i++) {
        char letter = guessWord.charAt(i);
        String color = "red";
  
        if (letter == answer.charAt(i)) {
          color = "green";
        } else {
          for (char answerChar : answer.toCharArray()) {
            if (letter == answerChar) {
              color = "yellow";
              break;
            }
          }
        }
        allGuesses[currentGuess][i] = new WordleLetter(letter);
        allGuesses[currentGuess][i].setColor(color);
      }
      currentGuess++;
    }
  
    public String getAnswer() {
      return answer;
    }
  
    public int getNumberGuessesSoFar() {
      return currentGuess;
    }
  
    public WordleLetter[] getGuess(int guessNumber) {
      return allGuesses[guessNumber];
    }
  
    public boolean isGameOver() {
      return currentGuess == 6 || isGameWin();
    }
  
    public boolean isGameWin() {
      if (currentGuess == 0) return false;
  
      WordleLetter[] lastGuess = allGuesses[currentGuess - 1];
      for (int i = 0; i < lastGuess.length; i++) {
        if (lastGuess[i].getLetter() != answer.charAt(i)) {
          return false;
        }
      }
      return true;
    }
  
    public String toString() {
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < getNumberGuessesSoFar(); i++) {
        for (int j = 0; j < 5; j++) {
          result.append(allGuesses[i][j]);
        }
        result.append("\n");
      }
      return result.toString();
    }
  }
  