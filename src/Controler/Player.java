package Controler;
import java.util.Scanner;

public class Player {
    private char symbol;
    private Scanner scanner;

    public Player(char symbol) {
        this.symbol = symbol; //записываем символ игрока в поле symbol
        scanner = new Scanner(System.in); //создаем экземпляр сканера, который считывает ввод пользователя из консоли
    }

    /* */
    public int[] getNextMove() {
        System.out.print("Введите строку и столбец через пробел (например, 1 2): "); //выводим сообщение для пользователя
        int row = scanner.nextInt() - 1; //считываем индекс строки из ввода пользователя
        int col = scanner.nextInt() - 1;//считываем индекс стобца из ввода пользователя
        int[] nextMove = {row,col}; //объявляет и инцилизирует массив  с координатами следующего хода  игрока
        return nextMove; //возвращаем массив
    }

    /* Метод получения символа  */
    public char getSymbol() {
        return symbol;//возвращает символ игрока
    }
}


