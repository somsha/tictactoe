import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TicTacToeView {
	JButton[][] buttons = new JButton[3][3];
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JLabel  myLabel;
	 
	
	public TicTacToeView() {
		   JFrame frame = new JFrame("TerribleTicTacToe");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        JPanel myButtonPanel = new JPanel();
	        
	        myButtonPanel.setLayout(new GridLayout(3,3));
	        
	        
	        for( int i=0; i<3; i++) { 
	        	for(int j=0; j<3; j++) {
	        		buttons[i][j]= new JButton(" ");
	        		buttons[i][j].setPreferredSize(new Dimension(50,50));
	     	        myButtonPanel.add(buttons[i][j]);
	        	}
	        }
	        

	        JPanel myTextPanel = new JPanel();
	        myTextPanel.setLayout(new GridLayout(1,1));
	        myTextPanel.setPreferredSize(new Dimension(150,50));
	        myLabel = new JLabel("player 1's turn", SwingConstants.CENTER);
	        myTextPanel.add(myLabel);
	        
	        JPanel myMainPanel = new JPanel();
	        myMainPanel.setLayout(new BoxLayout(myMainPanel, BoxLayout.Y_AXIS));
	        myMainPanel.add(myButtonPanel);
	        myMainPanel.add(myTextPanel);
	       
	        frame.getContentPane().add(myMainPanel);
	        
	        
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	}

}
