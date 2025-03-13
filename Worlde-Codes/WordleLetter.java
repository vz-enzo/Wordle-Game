// Maurizio Gonzalez
// WordleLetter class

public class WordleLetter {
    private char letter;
    private String color;
  
    public WordleLetter(char letterIn) {
      this.letter = letterIn;
      this.color = null;
    }
  
    public void setColor(String color) {
      if ("green".equals(color) || "yellow".equals(color) || "red".equals(color)) {
        this.color = color;
      } else {
        System.out.println("Invalid color specified.");
      }
    }
  
    public boolean isGreen() {
      return "green".equals(this.color);
    }
  
    public char getLetter() {
      return this.letter;
    }
  
    public String toString() {
      String colorCode = color.equals("green") ? "\u001B[32m" :
                        color.equals("yellow") ? "\u001B[33m" : "\u001B[31m";
      return String.format("%s %s %s", colorCode, letter, "\u001B[0m");
    }
  }