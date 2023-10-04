
public interface Board {
	
	void move(int i,int j, Player player);
	
	boolean checkIfPlayerwin(Player player);
	
	boolean isOccupied(int i,int j);

}
