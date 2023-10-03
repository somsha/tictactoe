
public class Launcher {

	public static void main(String[] args) {
		Board board= new Board(3);
		Player[] players= new Player[2];
		players[0]= new Player('A');
		players[1]= new Player('B');
		TicTacToeModel model= new TicTacToeModel(board, players);
		TicTacToeView  view= new TicTacToeView ();
		TicTacToeController controller= new TicTacToeController(model, view);

	}

}
