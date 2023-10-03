
public class TicTacToeModel{
	private int turn = 0;
	private char[][] board = new char[3][3];
	private boolean gameover = false;
	private Player[] players;
	
	public TicTacToeModel() {

		for(int x = 0; x < 3; x++)
			for(int y = 0; y < 3; y++) {
				board[x][y] = ' ';
			}
		players= new Player[2];
		players[0]= new Player('A');
		players[1]= new Player('B');
	}
	
	
	
	public int getTurn() {
		return turn;
	}
	public void setTurn(int p) {
		turn=p;
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
	
	public boolean checkIfCurrentPlayerwin() {
		boolean win = false;
		
		
		char c = getCurrentPlayerSymbol();
		if(board[0][0] == c && board[0][1] == c && board[0][2] == c)
			win = true;
		if(board[1][0] == c && board[1][1] == c && board[1][2] == c)
			win = true;
		if(board[2][0] == c && board[2][1] == c && board[2][2] == c)
			win = true;

		if(board[0][0] == c && board[1][0] == c && board[2][0] == c)
			win = true;
		if(board[0][1] == c && board[1][1] == c && board[2][1] == c)
			win = true;
		if(board[0][2] == c && board[1][2] == c && board[2][2] == c)
			win = true;

		if(board[0][0] == c && board[1][1] == c && board[2][2] == c)
			win = true;
		if(board[0][2] == c && board[1][1] == c && board[2][0] == c)
			win = true;
		
		return win;
	}
	public boolean checkifP1win() {
		boolean win = false;
		
		
		char c = players[0].getSymbol();
		if(board[0][0] == c && board[0][1] == c && board[0][2] == c)
			win = true;
		if(board[1][0] == c && board[1][1] == c && board[1][2] == c)
			win = true;
		if(board[2][0] == c && board[2][1] == c && board[2][2] == c)
			win = true;

		if(board[0][0] == c && board[1][0] == c && board[2][0] == c)
			win = true;
		if(board[0][1] == c && board[1][1] == c && board[2][1] == c)
			win = true;
		if(board[0][2] == c && board[1][2] == c && board[2][2] == c)
			win = true;

		if(board[0][0] == c && board[1][1] == c && board[2][2] == c)
			win = true;
		if(board[0][2] == c && board[1][1] == c && board[2][0] == c)
			win = true;
		
		return win;
	}
	public boolean checkifP2win() {
		boolean win = false;
		
		char c = players[1].getSymbol();
		if(board[0][0] == c && board[0][1] == c && board[0][2] == c)
			win = true;
		if(board[1][0] == c && board[1][1] == c && board[1][2] == c)
			win = true;
		if(board[2][0] == c && board[2][1] == c && board[2][2] == c)
			win = true;

		if(board[0][0] == c && board[1][0] == c && board[2][0] == c)
			win = true;
		if(board[0][1] == c && board[1][1] == c && board[2][1] == c)
			win = true;
		if(board[0][2] == c && board[1][2] == c && board[2][2] == c)
			win = true;

		if(board[0][0] == c && board[1][1] == c && board[2][2] == c)
			win = true;
		if(board[0][2] == c && board[1][1] == c && board[2][0] == c)
			win = true;
		
		return win;	
	}
	
	public void updateBoard(int i,int j) {
		board[i][j]=getCurrentPlayerSymbol();
	}
	
	public char getCurrentPlayerSymbol() {
		return players[turn].getSymbol();
		
	}
	
	public int getNextPlayer() {
		if(turn==0) {
			return 1;
		}else {
			return 0;
		}
	}
	public void moveToNextPlayer() {
		if(turn==0) {
			turn=1;
		}else {
			turn=0;
		}
	}

}
