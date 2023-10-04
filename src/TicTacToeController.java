import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController {
	private Engine model;
	private TicTacToeView view;
	
	public TicTacToeController(Engine model, TicTacToeView view, int size) {
		this.model=model;
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
		this.view.updateMyLabel("player "+ model.getCurrentPlayer().getName()+ " turn");
		
		 
		
	}
	public void handleButtonClick(int i, int j) {
		if(!model.isValidMove(i, j)) return;
		this.view.setButtonText(i,j,model.getCurrentPlayer().getSymbol()+"");
   		model.getBoard().move(i, j, model.getCurrentPlayer());
   		if(model.checkIfCurrentPlayerwin()) {
   			this.view.updateMyLabel("player "+ model.getCurrentPlayer().getName() + " won!");
   			model.setGameover(true);
   			return;
   		}
   		model.moveToNextPlayer(); 
   		this.view.updateMyLabel("player "+ model.getCurrentPlayer().getName()+ " turn");
   		

	}
	

}
