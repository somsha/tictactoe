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
				this.view.buttons[i][j].addActionListener(new ActionListener() {
		        	@Override
		        	public void actionPerformed(ActionEvent e) {
		        		handleButtonClick(r,c);	
		        	}
		        });
				
			}
		}
		 
		
	}
	public void handleButtonClick(int i, int j) {
		if(this.view.buttons[i][j].getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.buttons[i][j].setText("O");
       		model.getBoard()[i][j] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.buttons[i][j].setText("X");
       		model.getBoard()[i][j] = 'X';
       		if(model.checkifP2win()) {
       			this.view.myLabel.setText("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setPlayer(0);
			this.view.myLabel.setText("player 1's turn");
		}

	}
	

}
