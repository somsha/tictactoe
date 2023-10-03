
public class Board {
	private char[][] board = new char[3][3];
	
	
	public Board() {
		for(int x = 0; x < 3; x++)
			for(int y = 0; y < 3; y++) {
				board[x][y] = ' ';
			}
	}
	
	public void move(int i,int j, Player player) {
		board[i][j]=player.getSymbol();
	}
	
	public boolean checkIfPlayerwin(Player player) {
		boolean win = false;
		
		
		char c = player.getSymbol();
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
	

}
