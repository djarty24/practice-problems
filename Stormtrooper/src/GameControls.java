
import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameControls extends JPanel{
	
	
	public void setup() {
		
		this.setBackground(Color.BLACK);
		JLabel title = new JLabel("Paratrooper");
		title.setForeground(Color.WHITE);
		add(title);
		
	}
	
	public GameControls() {
		
		setup();
				
	}
	
	
	
}
