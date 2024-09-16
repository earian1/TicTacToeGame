## Getting Started

A simple implementation of the classic Tic-Tac-Toe game, written in Java. This game is played in the terminal, where two players (Player X and Player O) take turns to mark spaces in a 3x3 grid. The game ends when one player successfully places three of their marks in a horizontal, vertical, or diagonal row, or when the board is full (resulting in a tie).

## Features
- Player vs. CPU.
- Board displayed in terminal.
- Each player takes turns to put marks.
- Game checks if there is a win after each move.

## How to play
1. Player starts by inputting a number (1-9) corressponding to a position on the board.
2. The CPU will enter a random position that is avaliable.
3. The game will end until
   - There are no avaliable spaces for the Player or CPU
   - The Player or CPU has gotten three marks in a row

## Running the Game
### Prerequisites
- Java Development Kit(JDK) in your system
- Terminal or Command Prompt to run the game

### Instructions
1. Clone the repository or download the TicTacToe source files
   ```
   git clone https://github.com/your-repository/tictactoe-java.git
   ```
2. Open the terminal or command prompt and navigate to the folder with the Java source files
   ```
   cd tictactoe-java
   ```
3. Compile and run the Java files
   ```
   javac TicTacToe.java

   java TicTacToe
   ```
4. Follow the prompts that the game presents. The board positons are numbered as presented
   ```
    1|2|3 
    -+-+-
    4|5|6
    -+-+-
    7|8|9
   ```
5. After each turn, the board will be displayed and the game will check if there is a winner or a tie
   ```
     | | 
    -+-+-
     | |
    -+-+-
     | |
    Enter a number (1-9): 1
    X| | 
    -+-+-
     | |
    -+-+-
     | |
    Player entered: 1
    X| |
    -+-+-
     | |
    -+-+-
     |O|
    CPU entered: 8
    Enter a number (1-9): 
   ```

