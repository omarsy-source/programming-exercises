package Player;
import java.util.*;
public class TicTacToe {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		  System.out.println("Wie viele Zeilen hat das Spielbrett? Bitte geben Sie eine ungerade Zahl:"); 
		  int n = scn.nextInt(); 
		  char[][] gameBoard = createGameBoard(n); 
		  showGameBoard(gameBoard); 
		  startGame(gameBoard, Player.X, scn); 
		  scn.close(); 
		 } 
		 
		 // Das Spielbrett mit seinem Anfangszustand füllen.
		 public static char[][] createGameBoard(int n) { 
		  char[][] board = new char[n][n]; 
		  for (int i = 0; i < n; i++) { 
		   for (int j = 0; j < n; j++) { 
		    board[i][j] = '-'; 
		   } 
		  } 
		  return board; 
		 } 
		 
		 // Die aktuellen Felder des Spielbretts anzeigen.
		 public static void showGameBoard(char[][] board) { 
		  for (int i = 0; i < board.length; i++) { 
		   for (int j = 0; j < board[i].length; j++) { 
		    System.out.print(j == board[i].length - 1 ? board[i][j] : board[i][j] + " | "); 
		   } 
		   System.out.println(); 
		  } 
		 } 
		 
		 public static void startGame(char[][] board, char marker, Scanner scn) { 
		  char player = marker; 
		  while (!hasWon(board) && Player.hasFreeCells(board)) { 
		   System.out.println("Zeilennummer und Spaltennummer eingeben (für den Spieler " + player + "):"); 
		   int line = scn.nextInt(); 
		   int column = scn.nextInt(); 
		   if (board[line][column] == Player.X || board[line][column] == Player.O) { 
		    System.out.println("Dieses Feld ist besetzt!"); 
		    startGame(board, player, scn); 
		   } else { 
		             board[line][column] = player; 
		             showGameBoard(board); 
		             player = restart(board, player); 
		                                                           } 
		  } 
		 } 
		 
		 public static char restart(char[][] board, char player) { 
		  if (hasWon(board)) { 
		   System.out.println("Der Spieler " + player + " ist der Gewinner!"); 
		  } else if (!Player.hasFreeCells(board)) { 
		   System.out.println("Kein Gewinner!"); 
		  } else { 
		   player = switchPlayer(player); 
		  } 
		  return player; 
		 } 
		 
		 // Zum nächsten Spieler wechseln.
		 public static char switchPlayer(char player) { 
		  return player == Player.O ? Player.X : Player.O; 
		 } 
		 
		 // Die Gewinnbedingungen für den aktuellen Spieler prüfen.
		 public static boolean hasWon(char[][] board) { 
		  return Player.hasWonHorizontally(board) || Player.hasWonVertically(board); 
		


	}

}
