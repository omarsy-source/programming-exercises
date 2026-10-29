package Player;
import java.util.Arrays;
import java.util.Scanner;
public class Player {



	
	    final static char X = 'X';
	    final static char O = 'O';
	    final static char EMPTY = '-';
	    
	    // Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	    public static void main(String[] args) {
	        char[][] board = {
	            {EMPTY, EMPTY, EMPTY},
	            {EMPTY, EMPTY, EMPTY},
	            {EMPTY, EMPTY, EMPTY}
	        };
	        
	        printBoard(board);
	        // Test der Funktionen
	        System.out.println("Freie Felder: " + hasFreeCells(board));
	        
	        // Simuliere Gewinn horizontal
	        board[0][0] = board[0][1] = board[0][2] = X;
	        System.out.println("Horizontal: " + hasWonHorizontally(board));
	        printBoard(board);
	    }
	    
	    // Prüfen, ob auf dem Spielbrett noch freie Felder vorhanden sind.
	    public static boolean hasFreeCells(char[][] board) {
	        for (int i = 0; i < board.length; i++) {
	            for (int m = 0; m < board[i].length; m++) {
	                if (board[i][m] == EMPTY) return true;
	            }
	        }
	        return false;
	    }
	    
	    // Die Zeilen auf einen horizontalen Sieg prüfen.
	    public static boolean hasWonHorizontally(char[][] board) {
	        for (int i = 0; i < board.length; i++) {
	            char firstValue = board[i][0];
	            if (firstValue != EMPTY) {
	                boolean winner = true;
	                for (int j = 1; j < board[i].length; j++) {
	                    if (board[i][j] != firstValue) {
	                        winner = false;
	                        break;  // Die Suche beenden, sobald die Bedingung verletzt ist.
	                    }
	                }
	                if (winner) return true;  // Das Ergebnis sofort zurückgeben.
	            }
	        }
	        return false;
	    }
	    
	    // Die Spalten auf einen vertikalen Sieg prüfen.
	    public static boolean hasWonVertically(char[][] board) {
	        for (int j = 0; j < board[0].length; j++) {
	            char firstValue = board[0][j];
	            if (firstValue != EMPTY) {
	                boolean winner = true;
	                for (int i = 1; i < board.length; i++) {
	                    if (board[i][j] != firstValue) {
	                        winner = false;
	                        break;  // Die Prüfung bei einem unpassenden Feld früh beenden.
	                    }
	                }
	                if (winner) return true;  // Das Ergebnis sofort zurückgeben.
	            }
	        }
	        return false;
	    }
	    
	    // Die Diagonalen auf einen Sieg prüfen.
	    public static boolean hasWonDiagonally(char[][] board) {
	        // Haupt-Diagonale
	        if (hasWonDiagonalHelper(board, 0, 0, 1, 1)) return true;
	        // Neben-Diagonale  
	        if (hasWonDiagonalHelper(board, 0, 2, 1, -1)) return true;
	        return false;
	    }
	    
	    private static boolean hasWonDiagonalHelper(char[][] board, int startRow, 
	                                                  int startColumn, int dz, int ds) {
	        char firstValue = board[startRow][startColumn];
	        if (firstValue == EMPTY) return false;
	        
	        for (int i = 1; i < board.length; i++) {
	            int z = startRow + i * dz;
	            int s = startColumn + i * ds;
	            if (board[z][s] != firstValue) return false;
	        }
	        return true;
	    }
	    
	    // Das aktuelle Spielbrett ausgeben.
	    public static void printBoard(char[][] board) {
	        for (char[] line : board) {
	            System.out.println(Arrays.toString(line)
	                .replace("[", " ").replace("]", " ")
	                .replace(",", " | "));
	            System.out.println("---------");
	        }
	        System.out.println();
	    }
	}
