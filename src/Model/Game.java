package Model;

import Controler.Bot;
import Controler.Player;
import View.Board;

public class Game {
    private Board board;
    private Player player;
    private Bot bot;

    public Game() {
        board = new Board(); //инициализация доски
        player = new Player('X'); //инициализация игрока с символом X
        bot = new Bot('O');  //инициализация бота с символом O
    }
    /* Метод начала игры */
    public void start() {
        board.printBoard(); // Вводим доску на экран
        while (true) { // Цикл игры, который рабаотает пока кто-то не выиграет или игра не настпуит ничья
            /* Ход игрока */
            int[] playerMove = player.getNextMove(); // получаем следующий ход
            board.makeMove(playerMove[0], playerMove[1], player.getSymbol());// делаем ход игрока
            if (board.checkWinner(player.getSymbol())) { // Если игрок выиграл
                System.out.println("Поздравляем, вы выиграли! ");
                break; // Завершаем цикл
            }
            /* Ничья  */
            if (board.isCellEmpty()) { // Делаем проверку на пустые клетки
                System.out.println("Ничья!"); // сообщение пользователю
                break; // выходим из цикла игры
            }

            /* Ход бота */
            int[] botMove = bot.getNextMove(board); // Бот делает следующий ход ъ
            board.makeMove(botMove[0], botMove[1], bot.getSymbol()); // Делаем ход по доске
            System.out.println("Ход бота: ");
            board.printBoard();

            if (board.checkWinner(bot.getSymbol())) {
                System.out.println("Вы проиграли,Вас надурила машина 0 выиграли ");
                break;
            }
            /* Если доска заполнена */
            if (board.isCellEmpty()) {
                System.out.println("Ничья! ");
                break;
            }
        }
    }
}
