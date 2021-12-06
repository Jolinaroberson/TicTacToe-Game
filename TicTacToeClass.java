public class TicTacToeClass {
	// Instance Variables
	private char[] board;
	private int turns;

	// Constructors
	public TicTacToeClass() {
		board = new char[9];
		turns = 0;

		for (int i = 0; i < 9; i++)
			board[i] = ' ';
	}

	// Accessor Methods

	public boolean isWinner(char p) {
		if (board[0] == p && board[1] == p && board[2] == p) {
			return true;
		} else if (board[3] == p && board[4] == p && board[5] == p) {
			return true;
		} else if (board[6] == p && board[7] == p && board[8] == p) {
			return true;
		} else if (board[0] == p && board[3] == p && board[6] == p) {
			return true;
		} else if (board[1] == p && board[4] == p && board[7] == p) {
			return true;
		} else if (board[2] == p && board[5] == p && board[8] == p) {
			return true;
		} else if (board[0] == p && board[4] == p && board[8] == p) {
			return true;
		} else if (board[2] == p && board[4] == p && board[6] == p) {
			return true;
		} else {
			return false;
		}
	}

	public boolean boardIsFull() {
		if (turns == 9) {
			return true;
		}
		return false;

	}

	public boolean isCat() {
		if (boardIsFull() == true && isWinner('X') != true && isWinner('O') != true) {
			return true;
		}

		return false;
	}

	public boolean isValid(int i) {
		if (0 <= i && i <= 8)
			return true;
		return false;		
	}


	public int numTurns() {
		return turns;
	}

	public char playerAt(int i) {
		if (isValid(i))
			return board[i];
		else
			return '@';
	}

	public void displayBoard() {
		System.out.println("  0  " + board[0] + "|" + board[1] + "|" + board[2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[3] + "|" + board[4] + "|" + board[5]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[6] + "|" + board[7] + "|" + board[8]);
		System.out.println("     0 1 2 ");
	}

	// Modifiers
	public void playMove(char p, int i) {
		board[i] = p;
		turns++;

	}

}