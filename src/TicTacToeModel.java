
public class TicTacToeModel{
	private int player = 0;
	private char[][] board = new char[3][3];
	private boolean gameover = false;
	
	public TicTacToeModel() {

		for(int x = 0; x < 3; x++)
			for(int y = 0; y < 3; y++) {
				board[x][y] = ' ';
			}
		
	}
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int p) {
		player=p;
	}
	public char[][] getBoard() {
		return board;
	}
	public boolean isGameover() {
		return gameover;
	}
	public void setGameover(boolean gameover) {
		this.gameover=gameover;
		
	}
	public boolean checkifP1win() {
		boolean win = false;
		
		
		if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
			win = true;
		if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
			win = true;
		if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
			win = true;

		if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
			win = true;
		if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
			win = true;
		if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
			win = true;

		if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
			win = true;
		if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
			win = true;
		
		return win;
	}
	public boolean checkifP2win() {
		boolean win = false;
		
		if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
			win = true;
		if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
			win = true;
		if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
			win = true;

		if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
			win = true;
		if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
			win = true;
		if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
			win = true;

		if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
			win = true;
		if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
			win = true;
		
		return win;	
	}

}
