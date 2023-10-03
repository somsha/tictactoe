import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController {
	private TicTacToeEngine model;
	private TicTacToeView view;
	
	public TicTacToeController(TicTacToeEngine model, TicTacToeView view) {
		this.model=model;
		this.view=view;
		
		
		
		for( int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
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
		 
		
	}
	public void handleButtonClick(int i, int j) {
		if(this.view.getButtonText(i,j) != " " || model.isGameover()) return;
		this.view.setButtonText(i,j,model.getCurrentPlayerSymbol()+"");
   		model.move(i,j);
   		if(model.checkIfCurrentPlayerwin()) {
   			this.view.updateMyLabel("player "+ (model.getTurn()+1)+ " won!");
   			model.setGameover(true);
   			return;
   		}
   		model.moveToNextPlayer(); 
   		this.view.updateMyLabel("player "+ (model.getNextPlayer()+1)+ " turn");
   		

	}
	

}
