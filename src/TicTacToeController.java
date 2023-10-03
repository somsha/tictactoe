import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController {
	private TicTacToeModel model;
	private TicTacToeView view;
	
	public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
		this.model=model;
		this.view=view;
		
		 this.view.button1.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		handleButton1Click();	
	        	}
	        });
		 this.view.button2.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		handleButton2Click();	
	        	}
	        });
		 this.view.button3.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		handleButton3Click();	
	        	}
	        });
		 this.view.button4.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		handleButton4Click();	
	        	}
	        });
		 this.view.button5.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		handleButton5Click();	
	        	}
	        });
		 this.view.button6.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		handleButton6Click();	
	        	}
	        });
		 this.view.button7.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		handleButton7Click();	
	        	}
	        });
		 this.view.button8.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		handleButton8Click();	
	        	}
	        });
		 this.view.button9.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		handleButton9Click();	
	        	}
	        });
		
		
	}
	public void handleButton1Click() {
		if(this.view.button1.getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.button1.setText("O");
       		model.getBoard()[0][0] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.button1.setText("X");
       		model.getBoard()[0][0] = 'X';
       		if(model.checkifP2win()) {
       			this.view.myLabel.setText("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setPlayer(0);
			this.view.myLabel.setText("player 1's turn");
		}

	}
	public void handleButton2Click() {
		if(this.view.button2.getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.button2.setText("O");
       		model.getBoard()[0][1] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.button2.setText("X");
       		model.getBoard()[0][1] = 'X';
       		if(model.checkifP2win()) {
       			this.view.myLabel.setText("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setPlayer(0);
			this.view.myLabel.setText("player 1's turn");
		}

	}
	public void handleButton3Click() {
		if(this.view.button3.getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.button3.setText("O");
       		model.getBoard()[0][2] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.button3.setText("X");
       		model.getBoard()[0][2] = 'X';
       		if(model.checkifP2win()) {
       			this.view.myLabel.setText("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setPlayer(0);
			this.view.myLabel.setText("player 1's turn");
		}

	}
	public void handleButton4Click() {
		if(this.view.button4.getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.button4.setText("O");
       		model.getBoard()[1][0] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.button4.setText("X");
       		model.getBoard()[1][0] = 'X';
       		if(model.checkifP2win()) {
       			this.view.myLabel.setText("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setPlayer(0);
			this.view.myLabel.setText("player 1's turn");
		}

	}
	public void handleButton5Click() {
		if(this.view.button5.getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.button5.setText("O");
       		model.getBoard()[1][1] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.button5.setText("X");
       		model.getBoard()[1][1] = 'X';
       		if(model.checkifP2win()) {
       			this.view.myLabel.setText("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setPlayer(0);
			this.view.myLabel.setText("player 1's turn");
		}

	}
	public void handleButton6Click() {
		if(this.view.button6.getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.button6.setText("O");
       		model.getBoard()[1][2] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.button6.setText("X");
       		model.getBoard()[1][2] = 'X';
       		if(model.checkifP2win()) {
       			this.view.myLabel.setText("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setPlayer(0);
			this.view.myLabel.setText("player 1's turn");
		}

	}
	public void handleButton7Click() {
		if(this.view.button7.getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.button7.setText("O");
       		model.getBoard()[2][0] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.button7.setText("X");
       		model.getBoard()[2][0] = 'X';
       		if(model.checkifP2win()) {
       			this.view.myLabel.setText("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setPlayer(0);
			this.view.myLabel.setText("player 1's turn");
		}

	}
	public void handleButton8Click() {
		if(this.view.button8.getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.button8.setText("O");
       		model.getBoard()[2][1] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.button8.setText("X");
       		model.getBoard()[2][1] = 'X';
       		if(model.checkifP2win()) {
       			this.view.myLabel.setText("player 2 won!");
       			model.setGameover(true);
       			return;
       		}
			model.setPlayer(0);
			this.view.myLabel.setText("player 1's turn");
		}

	}
	public void handleButton9Click() {
		if(this.view.button9.getText() != " " || model.isGameover()) return;
		if(model.getPlayer() == 0) {
			this.view.button9.setText("O");
       		model.getBoard()[2][2] = 'O';
       		if(model.checkifP1win()) {
       			this.view.myLabel.setText("player 1 won!");
       			model.setGameover(true);
       			return;
       		}
		 	model.setPlayer(1);
    		this.view.myLabel.setText("player 2's turn");
		}
		else {
			this.view.button9.setText("X");
       		model.getBoard()[2][2] = 'X';
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
