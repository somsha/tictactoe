
public class TicTacToePlayer implements Player {
	private char symbol;
	
	@Override
	public char getSymbol() {
		return symbol;
	}
	
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	public TicTacToePlayer(char symbol) {
		this.symbol = symbol;
		
	}
}
