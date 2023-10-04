
public class TicTacToeBoard implements Board {
	private final char[][] board;
	private final int size;
	
	public TicTacToeBoard(int size) {
		this.size = size;
		board = new char[size][size];
		for(int  x= 0; x < size; x++)
			for(int y = 0; y <size; y++) {
				board[x][y] = ' ';
			}
	}
	
	@Override
	public void move(int i,int j, Player player) {
		board[i][j]=player.getSymbol();
	}
	
	@Override
	public boolean checkIfPlayerwin(Player player) {
		
		char c = player.getSymbol();
		
		for (int i=0; i<size; i++) {
			boolean win =true;
			for (int j=0; j<size; j++) {
				if(board[i][j]!= c) {
					win=false;
					break;
				}
			}
			if (win) {
				return true;
			}
		}
		
		for (int j=0; j<size; j++) {
			boolean win =true;
			for (int i=0; i<size; i++) {
				if(board[i][j]!= c) {
					win=false;
					break;
				}
			}
			if (win) {
				return true;
			}
		}
		
		boolean win=true;
		for (int i=0; i<size; i++) {
			if(board[i][i]!= c) {
				win=false;
				break;
			}
		}
		if (win) {
			return true;
		}
		
	    win =true;
		for (int i=0; i<size; i++) {
			if(board[i][size-i-1]!= c) {
				win=false;
				break;
			}
		}
		
		
		return win;
	}
	

}


