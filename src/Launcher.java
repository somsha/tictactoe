
public class Launcher {

	public static void main(String[] args) {
		Board board= new TicTacToeBoard(3);
		Player[] players= new TicTacToePlayer[2];
		players[0]= new TicTacToePlayer('A', "Ali");
		players[1]= new TicTacToePlayer('B', "Sara");
		TicTacToeEngine model= new TicTacToeEngine(board, players);
		TicTacToeView  view= new TicTacToeView ();
		TicTacToeController controller= new TicTacToeController(model, view, 3);

	}

}
