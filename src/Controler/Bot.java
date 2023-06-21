package Controler;

import View.Board;

import java.util.Random;

public class Bot {
    private char symbol; //символ, которым играет бот (например, 'O')
    private Random random; //генератор случайных чисел
    private static final  int MAP_SIZE = 3;
    private static final  char EMPTY_FIELD = '*';

    public Bot(char symbol) {
        this.symbol = symbol;
        random = new Random();
    }

    /* Возврщает следущий ход бота */
    public int[] getNextMove(Board board) {
        int row, col;
        do { //цикл do-while, чтобы генерировать новые координаты, если ячейка занята
            row = random.nextInt(MAP_SIZE);
            col = random.nextInt(MAP_SIZE);
        } while (board.getBoard()[row][col] != EMPTY_FIELD); // Повторяем пока не найдем свободную ячейку
        int[] nextMove = {row, col}; //создаем массив с координатами бота
        return nextMove; //возвращаем массив
    }
    /* Метод получения символа  */
    public char getSymbol() {
        return symbol; // Возвращаем символ
    }
}
