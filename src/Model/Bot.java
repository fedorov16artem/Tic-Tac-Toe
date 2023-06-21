package Model;

import View.Board;

import java.util.Random;

public class Bot {
    private char symbol; //символ, которым играет бот (например, 'O')
    private Random random; //генератор случайных чисел

    public Bot(char symbol) {
        this.symbol = symbol;
        random = new Random();
    }


    public int[] getNextMove(Board board) { //возвращает координаты следующего хода бота
        int row, col;
        do { //цикл do-while, чтобы генерировать новые координаты, если ячейка занята
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (board.getBoard()[row][col] != '*');
        int[] nextMove = {row, col};
        return nextMove;
    }

    public char getSymbol() {  //метод, который возвращает символ бота
        return symbol;
    }
}
