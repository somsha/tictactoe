
public class TicTacToeEngine implements Engine{
	private int turn = 0;
	
	private boolean gameover = false;
	private Player[] players;
	private Board board;
	
	public TicTacToeEngine(Board board , Player[] players) {
		
	    this.board = board;
	    this.players = players;	
	}
	
	
	
	public int getTurn() {
		return turn;
	}
	public void setTurn(int p) {
		turn=p;
	}
	
	public boolean isGameover() {
		return gameover;
	}
	public void setGameover(boolean gameover) {
		this.gameover=gameover;
		
	}
	
	public boolean checkIfCurrentPlayerwin() {
		return board.checkIfPlayerwin(getCurrentPlayer());
	}
	
	public void move(int i,int j) {
		board.move(i, j, getCurrentPlayer());
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
	
	@Override
	public Player getCurrentPlayer() {
	    return players[turn];
	}

}
