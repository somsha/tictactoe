import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TicTacToeView {
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
	        
	        button1 = new JButton(" ");
	        button1.setPreferredSize(new Dimension(50,50));
	        myButtonPanel.add(button1);
	        button2 = new JButton(" ");
	        myButtonPanel.add(button2);
	        button3 = new JButton(" ");
	        myButtonPanel.add(button3);
	        button4 = new JButton(" ");
	        myButtonPanel.add(button4);
	        button5 = new JButton(" ");
	        myButtonPanel.add(button5);
	        button6 = new JButton(" ");
	        myButtonPanel.add(button6);
	        button7 = new JButton(" ");
	        myButtonPanel.add(button7);
	        button8 = new JButton(" ");
	        myButtonPanel.add(button8);
	        button9 = new JButton(" ");
	        myButtonPanel.add(button9);

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
