
public class TicTacToePlayer implements Player {
	private final char symbol;
	private final String name;
	
	public TicTacToePlayer(char symbol, String name) {
		this.symbol = symbol;
		this.name = name;
		
	}
	
	@Override
	public char getSymbol() {
		return symbol;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
