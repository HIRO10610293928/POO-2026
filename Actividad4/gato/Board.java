package Actividad4.gato;

/**
 * Representa el tablero del juego de gato (Tic Tac Toe)
 */
public class Board {
    private static final int SIZE = 3;
    private char[][] board;
    
    public Board() {
        board = new char[SIZE][SIZE];
        initializeBoard();
    }
    
    /**
     * Inicializa el tablero vacío
     */
    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    /**
     * Coloca una marca (X u O) en la posición especificada
     * @param row la fila (0-2)
     * @param col la columna (0-2)
     * @param mark la marca ('X' u 'O')
     * @return true si la jugada es válida, false si la casilla está ocupada
     */
    public boolean placeMark(int row, int col, char mark) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            return false;
        }
        if (board[row][col] != ' ') {
            return false;
        }
        board[row][col] = mark;
        return true;
    }
    
    /**
     * Verifica si la casilla está vacia
     */
    public boolean isEmpty(int row, int col) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            return false;
        }
        return board[row][col] == ' ';
    }
    
    /**
     * Verifica si hay un ganador
     * @param mark la marca a verificar
     * @return true si hay tres en línea
     */
    public boolean isWinner(char mark) {
        // Verificar filas
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) {
                return true;
            }
        }
        
        // Verificar columnas
        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] == mark && board[1][j] == mark && board[2][j] == mark) {
                return true;
            }
        }
        
        // Verificar diagonales
        if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) {
            return true;
        }
        if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) {
            return true;
        }
        
        return false;
    }
    
    /**
     * Verifica si el tablero está lleno
     */
    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Muestra el tablero en consola
     */
    public void display() {
        System.out.println("\n" + Language.getText("grid_row"));
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1) System.out.print(" | ");
            }
            System.out.println();
            if (i < SIZE - 1) System.out.println("  -----------");
        }
        System.out.println();
    }
}
