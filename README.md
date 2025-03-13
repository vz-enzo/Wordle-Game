# Wordle-Game (Java)
Hey there ;) This is my Java-based Wordle game, a fun little project I built to practice Java and mess around with file handling, loops, and logic. It plays like the real Wordle guess a 5-letter word in 6 tries, and you'll get color-coded feedback:

🟩 Green = Correct letter in the right spot
🟨 Yellow = Correct letter, wrong spot
🟥 Red = Not in the word at all

src/ → Contains all Java source code
dictionary.txt & answers.txt → List of valid words and Wordle answers
README.md → This file
.gitignore → Keeps unnecessary files out of the repo

How to play?
1. Clone this repo and navigate into the folder:
git clone https://github.com/YOUR_USERNAME/WordleGame-Java.git
cd WordleGame-Java

2. Compile the Java files:
javac src/*.java

3. Run the game:
java src.Main

4. Pick a puzzle number (0-2315)
5. Enter a 5-letter word guess
6. See the feedback and keep guessing until you solve it (or run out of tries)

🛠 Features
2,315 different word puzzles
* Checks if your guess is a valid dictionary word
* Color-coded feedback for each letter
* 6 attempts max, just like the real game
* Playable in the terminal

Contact
Made by: Maurizio Gonzalez
GitHub: vz-enzo
Email: vichegonza10@outlook.es


