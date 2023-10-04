
public class Launcher {

	public static void main(String[] args) {
		int size = 3;
		Board board= new TicTacToeBoard(size);
		Player[] players= new Player[2];
		players[0]= new TicTacToePlayer('A', "Ali");
		players[1]= new TicTacToePlayer('B', "Sara");
		Engine model= new TicTacToeEngine(board, players);
		View  view= new TicTacToeView (size);
		TicTacToeController controller= new TicTacToeController(model, view, size);

	}

}
