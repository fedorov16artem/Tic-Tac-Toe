package Controler;

import View.Board;
import java.util.Random;


public class Bot {
    private char symbol; //символ, которым играет бот (например, 'O')
    private static final  int MAP_SIZE = 3;


    public Bot(char symbol) {
        this.symbol = symbol;
    }

    /* Возврщает следущий ход бота */
    public int[] getNextMove(Board board) {
        int row, col;
        do { //цикл do-while, чтобы генерировать новые координаты, если ячейка занята
            row = (int)(Math.random()*MAP_SIZE);
            col = (int)(Math.random()*MAP_SIZE);
        } while (!board.isInputError(row,col)); // Делаем проверку пустая ли ячейка
        int[] nextMove = {row, col}; //создаем массив с координатами бота
        return nextMove; //возвращаем массив
    }
    /* Метод получения символа  */
    public char getSymbol() {
        return symbol; // Возвращаем символ
    }
}
