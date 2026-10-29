package Exercise02;

public class Player {
	final static char X = 'X';
	final static char O = 'O';

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {

	}

	// Prüfen, ob auf dem Spielbrett noch ein freies Feld vorhanden ist.
	public static boolean hasFreeCells(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int m = 0; m < board[i].length; m++) {
				if (board[i][m] == '-')
					return true;

			}
		}
		return false;
	}
	// Die Zeilen auf gleiche Spielermarkierungen prüfen.
	public static boolean hasWonHorizontally (char [][]board) {
		boolean winner = false;
		for(int i = 0 ; i<board.length ; i++) {
			char firstValue = board[i][0];
			if(firstValue != '-')
				winner = true;
			
			for(int j = 1 ;j<board[i].length ; j++ ) {
				if (board[i][j] != firstValue)
					winner = false ;
			}
		}
		return winner ;
		
	}
	// Die Spalten auf gleiche Spielermarkierungen prüfen.
	public static boolean hasWonVertically (char [][]board) {
		boolean winner = false;
		for(int j = 0 ; j<board[0].length ; j++) {
			char firstValue = board[0][j];
			if(firstValue != '-')
				winner = true;
			
			for(int i = 1 ;i<board.length ; i++ ) {
				if (board[i][j] != firstValue)
					winner = false ;
			}
		}
		return winner ;
		
		
	}
}
