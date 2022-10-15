
package main;

import java.awt.Graphics;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;


public class GamePanel extends JPanel{

	// FIELDS
	private MouseInputs mouseInputs;
	
	// CONTSTRUCTORS
	public GamePanel() {
		
		mouseInputs = new MouseInputs();
		addKeyListener(new KeyboardInputs());
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}
	
	// METHODS
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawRect(100, 100, 200, 50);
		
	}
	
}
