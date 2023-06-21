package Controler;
import java.util.Scanner;

public class Player {
    private char symbol;
    private Scanner scanner;

    public Player(char symbol) {
        this.symbol = symbol;
        scanner = new Scanner(System.in);
    }

    public int[] getNextMove() {
        System.out.print("Введите строку и столбец через пробел (например, 1 2): ");
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;
        int[] nextMove = {row, col};
        return nextMove;
    }

    public char getSymbol() { //возвращает символ игрока
        return symbol;
    }
}


