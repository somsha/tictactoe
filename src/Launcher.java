
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToeModel model= new TicTacToeModel();
		TicTacToeView  view= new TicTacToeView ();
		TicTacToeController controller= new TicTacToeController(model, view);

	}

}
