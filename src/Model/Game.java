package Model;

import Controler.Player;
import View.Board;

public class Game {
    private Board board;
    private Player player;
    private Bot bot;

    public Game() {
        board = new Board();
        player = new Player('X');
        bot = new Bot('O');
    }

    public void start() { //начинает игру
        board.printBoard();
        while (true) {
            //ход игрока
            int[] playerMove = player.getNextMove();
            board.makeMove(playerMove[0], playerMove[1], player.getSymbol());
            if (board.checkWinner(player.getSymbol())) {
                System.out.println("Поздравляем, вы выиграли! ");
                break;
            }

            if (board.isCellEmpty()) {
                System.out.println("Ничья!");
                break;
            }

            //ход бота
            int[] botMove = bot.getNextMove(board);
            board.makeMove(botMove[0], botMove[1], bot.getSymbol());
            System.out.println("Ход бота: ");
            board.printBoard();

            if (board.checkWinner(bot.getSymbol())) {
                System.out.println("Вы проиграли,Вас надурила машина 0 выиграли ");
                break;
            }

            if (board.isCellEmpty()) {
                System.out.println("Ничья! ");
                break;
            }
        }
    }
}
