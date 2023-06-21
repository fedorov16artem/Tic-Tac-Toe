package View;


public class Board {
    private static final  int MAP_SIZE = 3;  // размер игрового поля (Константа)
    private static final  char EMPTY_FIELD = '*'; // Чем азполняем игровое поле (Константа)
    private static char[][] board;//создаем двумерный массив символов, представляющий игровое поле
    /* Конструктор класса, СОздаем массив и заполняет его "*" */
    public Board() {
        board = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                board[i][j] = EMPTY_FIELD;
            }
        }
    }
    /*Метод для печати игрового поля */
    public void printBoard() {
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();

        }
    }
    /* Метод для проверки  наличия свобоных ячеек */
    public boolean isCellEmpty() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (board[i][j] == EMPTY_FIELD) {
                    return false; // Если хоть одна ячейка пустая
                }
            }
        }
        return true; // если все поля заняты

    }
    /* Проверка на победиля */
    public boolean checkWinner(char symbol) {
        /* проверка строк */
        for (int i = 0; i < MAP_SIZE; i++) {
            if (board[i][0] != EMPTY_FIELD && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        /* проверка столбцов */
        for (int j = 0; j < MAP_SIZE; j++) {
            if (board[0][j] != EMPTY_FIELD && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        /* проверка диагоналей */
        if (board[0][0] != EMPTY_FIELD && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != EMPTY_FIELD && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }
    /* Метод который делает ход на игровом поле */
    public void makeMove(int row, int col, char symbol) { //ход игрока или бота
        board[row][col] = symbol; // Заменяем пустую клетку на символ игрока
    }
    /* Метод для полученя игрового поля*/
    public char[][] getBoard() {
        return board; //возвращает игровое поле
    }
    /* Метод для проверки пустая ли клетка */
//    public static boolean isInputError(int row, int col){
//        if (row < 0 || col < 0 || row >= MAP_SIZE || col >= MAP_SIZE){
//            return false;
//        }
//        if (board[row][col] != EMPTY_FIELD) {
//            return false;
//        }
//        return true;
//    }
}

