
public class TicTacToeModel{
	private int turn = 0;
	
	private boolean gameover = false;
	private Player[] players;
	private Board board;
	
	public TicTacToeModel() {
		this.board= new Board();

		
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
	
	public Player getCurrentPlayer() {
	    return players[turn];
	}

}
