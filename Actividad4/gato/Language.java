package Actividad4.gato;

/**
 * Clase para manejar los idiomas disponibles (Español e Inglés)
 */
public class Language {
    public enum Lang {
        SPANISH, ENGLISH
    }
    
    private static Lang currentLanguage = Lang.SPANISH;
    
    public static void setLanguage(Lang language) {
        currentLanguage = language;
    }
    
    public static Lang getLanguage() {
        return currentLanguage;
    }
    
    public static String getText(String key) {
        if (currentLanguage == Lang.SPANISH) {
            return getSpanish(key);
        } else {
            return getEnglish(key);
        }
    }
    
    private static String getSpanish(String key) {
        switch (key) {
            case "welcome":
                return "=== Bienvenido al Juego de Gato ===";
            case "player1":
                return "Jugador 1: X";
            case "player2":
                return "Jugador 2: O";
            case "select_language":
                return "Selecciona el idioma / Select language:";
            case "spanish":
                return "1. Español";
            case "english":
                return "2. English";
            case "enter_choice":
                return "Ingresa tu opción (1 o 2): ";
            case "invalid_choice":
                return "Opción inválida. Intenta de nuevo.";
            case "enter_row":
                return "Jugador %s, ingresa fila (0-2): ";
            case "enter_col":
                return "Jugador %s, ingresa columna (0-2): ";
            case "invalid_input":
                return "Entrada inválida. Ingresa un número entre 0-2: ";
            case "cell_occupied":
                return "Casilla no disponible. Intenta de nuevo.";
            case "winner":
                return "¡Jugador %s (Ganador)!";
            case "tie":
                return "¡Empate!";
            case "grid_row":
                return "   0   1   2";
            default:
                return key;
        }
    }
    
    private static String getEnglish(String key) {
        switch (key) {
            case "welcome":
                return "=== Welcome to Tic Tac Toe ===";
            case "player1":
                return "Player 1: X";
            case "player2":
                return "Player 2: O";
            case "select_language":
                return "Select language / Selecciona el idioma:";
            case "spanish":
                return "1. Español";
            case "english":
                return "2. English";
            case "enter_choice":
                return "Enter your choice (1 or 2): ";
            case "invalid_choice":
                return "Invalid choice. Try again.";
            case "enter_row":
                return "Player %s, enter row (0-2): ";
            case "enter_col":
                return "Player %s, enter column (0-2): ";
            case "invalid_input":
                return "Invalid input. Enter a number between 0-2: ";
            case "cell_occupied":
                return "Cell not available. Try again.";
            case "winner":
                return "Player %s (Winner)!";
            case "tie":
                return "Tie!";
            case "grid_row":
                return "   0   1   2";
            default:
                return key;
        }
    }
}
