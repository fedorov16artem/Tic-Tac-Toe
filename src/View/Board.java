package View;
public class Board {
    static final  int MAP_SIZE = 3;
    private char[][] board;//создаем двумерный массив символов, представляющий игровое поле
    public Board() {  //заполняем игровое поле символом '*'
        board = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                board[i][j] = '*';
            }
        }
    }

    public void printBoard() { //выводит на экран игровое поле
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();

        }
    }

    public boolean isCellEmpty() {//Делаем проверку заполнено ли поле
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (board[i][j] == '*') {
                    return false;
                }
            }
        }
        return true;

    }
    /* Проверка на победиля */
    public boolean checkWinner(char symbol) {
        //проверка строк
        for (int i = 0; i < MAP_SIZE; i++) {
            if (board[i][0] != '*' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        //проверка столбцов
        for (int j = 0; j < MAP_SIZE; j++) {
            if (board[0][j] != '*' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        //проверка диагоналей
        if (board[0][0] != '*' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '*' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    public void makeMove(int row, int col, char symbol) { //ход игрока или бота
        board[row][col] = symbol;
    }

    public char[][] getBoard() { //возвращает игровое поле
        return board;
    }
}

