package Controler;
import java.util.Scanner;
import View.Board;




public class Player {
    private char symbol;
    private Scanner scanner;


    public Player(char symbol) {
        this.symbol = symbol; //записываем символ игрока в поле symbol
        scanner = new Scanner(System.in); //создаем экземпляр сканера, который считывает ввод пользователя из консоли
    }

    /* */
    public int[] getNextMove() {
        int row,col;
        do {
            System.out.print("Введите строку и столбец через пробел (например, 1 2): "); //выводим сообщение для пользователя
            row = scanner.nextInt() - 1; //считываем индекс строки из ввода пользователя
            col = scanner.nextInt() - 1;//считываем индекс стобца из ввода пользователя
        }while (!Board.isInputError(row,col)); //Проверка свободная ли клетка
//        Board.board[row][col] = X_FIELD;
        int[] nextMove = {row,col}; //объявляет и инцилизирует массив  с координатами следующего хода  игрока
        return nextMove; //возвращаем массив

    }
    /* Метод получения символа  */
    public char getSymbol() {
        return symbol;//возвращает символ игрока
    }

}


