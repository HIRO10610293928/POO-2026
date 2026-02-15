package Actividad4.gato;

import java.util.Scanner;

/**
 * Controla la lógica del juego de gato (Tic Tac Toe)
 */
public class Game {
    private Board board;
    private char currentPlayer;
    private boolean gameOver;
    private Scanner scanner;
    
    public Game() {
        board = new Board();
        currentPlayer = 'X';
        gameOver = false;
        scanner = new Scanner(System.in);
    }
    
    /**
     * Selecciona el idioma
     */
    private void selectLanguage() {
        System.out.println(Language.getText("select_language"));
        System.out.println(Language.getText("spanish"));
        System.out.println(Language.getText("english"));
        System.out.print(Language.getText("enter_choice"));
        
        while (true) {
            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    Language.setLanguage(Language.Lang.SPANISH);
                    break;
                } else if (choice == 2) {
                    Language.setLanguage(Language.Lang.ENGLISH);
                    break;
                } else {
                    System.out.print(Language.getText("invalid_choice") + "\n" + Language.getText("enter_choice"));
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.print(Language.getText("invalid_choice") + "\n" + Language.getText("enter_choice"));
            }
        }
    }
    
    /**
     * Inicia el juego
     */
    public void start() {
        selectLanguage();
        scanner.nextLine(); // Limpiar buffer después de la selección de idioma
        
        System.out.println("\n" + Language.getText("welcome"));
        System.out.println(Language.getText("player1"));
        System.out.println(Language.getText("player2"));
        
        while (!gameOver) {
            board.display();
            playTurn();
            
            if (board.isWinner(currentPlayer)) {
                board.display();
                System.out.println(String.format(Language.getText("winner"), currentPlayer));
                gameOver = true;
            } else if (board.isFull()) {
                board.display();
                System.out.println(Language.getText("tie"));
                gameOver = true;
            } else {
                switchPlayer();
            }
        }
        
        scanner.close();
    }
    
    /**
     * Ejecuta el turno del jugador actual
     */
    private void playTurn() {
        boolean validMove = false;
        
        while (!validMove) {
            System.out.print(String.format(Language.getText("enter_row"), currentPlayer));
            int row = getInput();
            
            System.out.print(String.format(Language.getText("enter_col"), currentPlayer));
            int col = getInput();
            
            if (board.isEmpty(row, col)) {
                validMove = board.placeMark(row, col, currentPlayer);
            } else {
                System.out.println(Language.getText("cell_occupied"));
            }
        }
    }
    
    /**
     * Obtiene entrada válida del usuario
     */
    private int getInput() {
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input >= 0 && input <= 2) {
                    return input;
                } else {
                    System.out.print(Language.getText("invalid_input"));
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.print(Language.getText("invalid_input"));
            }
        }
    }
    
    /**
     * Cambia el jugador actual
     */
    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
