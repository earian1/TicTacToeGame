
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    public static void main(String[] args){


        char[][] gameBoard = {{' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},
                            };

        
        
        printGameBoard(gameBoard);
        while(true){
            Scanner scnr = new Scanner(System.in);

            System.out.print("Enter a number (1-9): ");
            int playerInput = scnr.nextInt();
            while(playerPositions.contains(playerInput) || cpuPositions.contains(playerInput)){
                System.out.print("Position taken, Choose another position(1-9): ");
                playerInput = scnr.nextInt();
            }
    
            placePiece(playerInput, gameBoard, "player");
            printGameBoard(gameBoard);
            System.out.println("Player entered: " + playerInput);

            String result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }

            Random rand = new Random();
            int cpuInput = rand.nextInt(9) + 1;
            while(cpuPositions.contains(cpuInput) || playerPositions.contains(cpuInput)){
                cpuInput = rand.nextInt(9) + 1;
            }
            placePiece(cpuInput, gameBoard, "cpu");
            printGameBoard(gameBoard);
            System.out.println("CPU entered: " + cpuInput);

            result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }
            
        }
        
        
    }
    public static void printGameBoard(char[][] gameBoard){
        for(char[] row: gameBoard){
            for(char e: row){
                System.out.print(e);
            }
            System.out.println();
        }
    }
    public static void placePiece(int input, char[][] gameBoard, String user){
        char symbol = ' ';

        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(input);
        }
        else if(user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(input);
        }
        else{
            symbol = ' ';
        }
        switch (input) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkWinner(){
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List middleCol = Arrays.asList(2, 5, 8);
        List bottomCol = Arrays.asList(3, 6, 9);
        List leftDiag = Arrays.asList(1, 5, 9);
        List rightDiag = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(middleRow);
        winning.add(bottomRow);
        winning.add(leftCol);
        winning.add(middleCol);
        winning.add(bottomCol);
        winning.add(leftDiag);
        winning.add(rightDiag);
        for(List l: winning){
            if(playerPositions.containsAll(l)){
                return "Player wins!!! :D";
            }
            else if(cpuPositions.containsAll(l)){
                return "CPU wins!! you lost :(";
            }
            else if(playerPositions.size() + cpuPositions.size() == 9){
                return "Tied!! no one won!";
            }
        }

        return "";
    }

}
