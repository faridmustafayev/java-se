package games.ticTacToe;

import java.util.*;
public class TicTacToe {

    static ArrayList<Integer> playerPosition = new ArrayList<>();
    static ArrayList<Integer> cpuPosition = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        while (true) {

            System.out.println("enter your placement (1-9) ");
            int playerPos = input.nextInt();

            while (playerPosition.contains(playerPos) || cpuPosition.contains(playerPos)) {
                System.out.println("position taken! Enter a correct position");
                playerPos = input.nextInt();
            }

            PlacePiece(gameBoard, playerPos, "player");
            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            Random random = new Random();
            int cpuPos = random.nextInt(9) + 1;

            while (playerPosition.contains(cpuPos) || cpuPosition.contains(cpuPos)) {
                System.out.println("position taken! Enter a correct position");
                cpuPos = random.nextInt(9) + 1;
                break;
            }

            PlacePiece(gameBoard, cpuPos, "cpu");

            printGameBoard(gameBoard);

            result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
        }

    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void PlacePiece(char[][] gameBoard, int position, String user) {

        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
            playerPosition.add(position);
        }
        else if (user.equals("cpu")) {
            symbol = '0';
            cpuPosition.add(position);
        }

        switch (position) {
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

    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);

        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);

        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (playerPosition.containsAll(l)) {
                return "Congratulations you won!";
            } else if (cpuPosition.containsAll(l)) {
                return "Cpu wins! Sorry :( ";
            } else if (playerPosition.size() + cpuPosition.size() == 9) {
                return "CAT!";
            }
        }

        return "";
    }
}