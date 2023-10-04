import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TicTacToeView implements View {
	private JButton[][] buttons;
	private JLabel  myLabel;
	 
	
	public TicTacToeView(int size) {
		buttons = new JButton[size][size];
		JFrame frame = new JFrame("TerribleTicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel myButtonPanel = new JPanel();
        
        myButtonPanel.setLayout(new GridLayout(size,size));
        
        
        for( int i=0; i<size; i++) { 
        	for(int j=0; j<size; j++) {
        		buttons[i][j]= new JButton(" ");
        		buttons[i][j].setPreferredSize(new Dimension(50,50));
     	        myButtonPanel.add(buttons[i][j]);
        	}
        }
        

        JPanel myTextPanel = new JPanel();
        myTextPanel.setLayout(new GridLayout(1,1));
        myTextPanel.setPreferredSize(new Dimension(150,50));
        myLabel = new JLabel("", SwingConstants.CENTER);
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
	
	@Override
	public void updateStatus(String s) {
		myLabel.setText(s);
	}
	
	@Override
	public String getButtonText(int i, int j) {
		return buttons[i][j].getText();
	}
	
	@Override
	public void setButtonText(int i, int j, String s ) {
		buttons[i][j].setText(s);	
	}
	
	@Override
	public void addButtonActionListener(int i,int j,ActionListener actionListener ) {
		buttons[i][j].addActionListener(actionListener );
	}

}
