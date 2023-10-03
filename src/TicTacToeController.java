import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController {
	private TicTacToeModel model;
	private TicTacToeView view;
	
	public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
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
		if(model.getTurn() == 0) {
			this.view.setButtonText(i,j,model.getCurrentPlayerSymbol()+"");
       		model.getBoard()[i][j] = model.getCurrentPlayerSymbol();
       		if(model.checkifP1win()) {
       			this.view.updateMyLabel("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setTurn(1);
    		this.view.updateMyLabel("player 2's turn");
		}
		else {
			this.view.setButtonText(i,j,model.getCurrentPlayerSymbol()+"");
       		model.getBoard()[i][j] = model.getCurrentPlayerSymbol();
       		if(model.checkifP2win()) {
       			this.view.updateMyLabel("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setTurn(0);
			this.view.updateMyLabel("player 1's turn");
		}

	}
	

}
