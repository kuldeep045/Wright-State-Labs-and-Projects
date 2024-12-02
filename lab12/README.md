# Word Game

## Description

This is a game of words where you are provided with seven unique scrambled letters. The goal is to form as many valid words as possible using these letters.  
**Note:** Words must be at least four letters long.

This project was completed using concepts such as data types, I/O, and classes.

---

## How to Play

1. At the start of the game, seven unique letters are displayed on the screen.
2. Form as many valid words as you can using the given letters.
3. **Scoring Rules:**
   - Four-letter words earn 1 point (e.g., `test` = 1 point).
   - Words longer than four letters earn 1 point per letter (e.g., `testing` = 7 points).
   - Invalid words, words with fewer than four letters, or previously guessed words are not scored.
   - There is no penalty for wrong guesses.

---

## Commands

- **`mix`**: Scrambles the displayed letters to help spark new ideas.
- **`ls`**: Displays all the valid words you've already guessed.
- **`bye`**: Exits the game.

---

## Requirements

To play this game, you need to have the following installed on your system:
- **JDK**: Includes the Java Development Kit and Compiler.
- **IDE** *(optional)*: VS Code with the Java extension or IntelliJ IDEA is recommended.

---

## Running the Project

### Option 1: Using an IDE
1. Open the project folder in your favorite IDE.
2. Open the `WordGame.java` file.
3. Run the project using the Java debugger or any available tools.

### Option 2: Without an IDE
1. Open the project folder in PowerShell or any terminal.
2. Run the following command:
   ```
    java WordGame.java

## Lessons Learned

### Concepts Practiced / Better Understood

- **Recursion:** Gained a deeper understanding of how to use recursion for handling invalid inputs and re-running methods efficiently.
- **Set Properties:** features like preventing duplicate entries and using methods such as `removeAll`.
- **ArrayList Manipulation:** Improved skills in dynamically adding, removing, and managing elements in an ArrayList.
- **File I/O:** Learned to read data from external files to make the game more dynamic and interactive.

---

### Bugs Detangled

- **Scrambling Letters:** Initially faced challenges with implementing the `mix` command to shuffle the letters, which was resolved with the help of AI tools.
- **Random Word Selection:** Overcame difficulties in ensuring the random selection of words with seven unique letters by applying concepts from class lectures and notes.

