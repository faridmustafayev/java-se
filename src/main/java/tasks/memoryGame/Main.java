package tasks.memoryGame;

public class Main {
    public static Kart[][] karts = new Kart[4][4];

    public static void main(String[] args) {

        karts[0][0] = new Kart('E');
        karts[0][1] = new Kart('A');
        karts[0][2] = new Kart('B');
        karts[0][3] = new Kart('F');
        karts[1][0] = new Kart('G');
        karts[1][1] = new Kart('A');
        karts[1][2] = new Kart('D');
        karts[1][3] = new Kart('H');
        karts[2][0] = new Kart('F');
        karts[2][1] = new Kart('C');
        karts[2][2] = new Kart('D');
        karts[2][3] = new Kart('H');
        karts[3][0] = new Kart('E');
        karts[3][1] = new Kart('G');
        karts[3][2] = new Kart('B');
        karts[3][3] = new Kart('C');

        gameBoard();
    }

    public static void gameBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (karts[i][j].isFlag()){
                    System.out.print("| " + karts[i][j].getValue() + " | ");
                }
                else {
                    System.out.print(" | | ");
                }
            }
            System.out.println();
        }
    }



}