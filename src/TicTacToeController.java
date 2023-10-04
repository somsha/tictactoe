import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController {
	private Engine engine;
	private View view;
	
	public TicTacToeController(Engine model, View view, int size) {
		this.engine=model;
		this.view=view;
		
		
		
		for( int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				final int r = i;
                final int c = j; 
                ActionListener actionListener=new ActionListener() {
		        	@Override
		        	public void actionPerformed(ActionEvent e) {
		        		handleButtonClick(r,c);	
		        	}
		        };
				this.view.addButtonActionListener(i,j, actionListener);
				
			}
		}
		this.view.updateStatus("player "+ model.getCurrentPlayer().getName()+ " turn");
	}
	public void handleButtonClick(int i, int j) {
		if(!engine.isValidMove(i, j)) return;
		this.view.setButtonText(i,j,engine.getCurrentPlayer().getSymbol()+"");
   		engine.getBoard().move(i, j, engine.getCurrentPlayer());
   		if(engine.checkIfCurrentPlayerwin()) {
   			this.view.updateStatus("player "+ engine.getCurrentPlayer().getName() + " won!");
   			engine.setGameover(true);
   			return;
   		}
   		engine.moveToNextPlayer(); 
   		this.view.updateStatus("player "+ engine.getCurrentPlayer().getName()+ " turn");
   		

	}
	

}
