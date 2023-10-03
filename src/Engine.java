
public interface Engine {
	Player getCurrentPlayer();

	void moveToNextPlayer();

	int getTurn();

	void setTurn(int p);

	boolean isGameover();

	void setGameover(boolean gameover);

	boolean checkIfCurrentPlayerwin();
}
