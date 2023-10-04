
public class TicTacToeEngine implements Engine{
	private int turn = 0;
	
	private boolean gameover = false;
	private Player[] players;
	private Board board;
	
	public TicTacToeEngine(Board board , Player[] players) {
		
	    this.board = board;
	    this.players = players;	
	}
	
	@Override
	public Board getBoard() {
		return board;
	}
	
	@Override
	public Player[] getPlayers() {
		return players;
	}	
	
	@Override
	public int getTurn() {
		return turn;
	}
	
	@Override
	public void setTurn(int p) {
		turn=p;
	}
	
	@Override
	public boolean isGameover() {
		return gameover;
	}
	
	@Override
	public void setGameover(boolean gameover) {
		this.gameover=gameover;
		
	}
	
	@Override
	public boolean checkIfCurrentPlayerwin() {
		return board.checkIfPlayerwin(getCurrentPlayer());
	}
	
	@Override
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

	@Override
	public boolean isValidMove(int i, int j) {
		return (!this.board.isOccupied(i,j) && !gameover);
	}

}
